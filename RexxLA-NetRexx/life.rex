#!/usr/bin/env rexx
/* Rexx */
/* ============================================================
   life.rex – a short, completely legal descent into madness
   Tested with ooRexx 5.3.0 r13196
   ============================================================ */

say "Booting reality..."

me  = .Me~new("Arthur")
her = .Woman~new("Trillian")

say "Initial state:"
say "  me   =" me
say "  her  =" her
say "  me~value =" me~value
say "  her~value =" her~value
say


/* First offence: operator overloading */

life = her + me

say "After 'life = her + me' :"
say "  life =" life
say "  life~value =" life~value
say


/* Second offence: replace her with an instance of a subclass */

her = .Girlfriend~new(her~value)

say "Now she is a Girlfriend:"
say "  her =" her
say "  life = her + me  again..."

life = her + me

say "  life =" life
say


/* Third offence: promote her again */

her = .Wife~new(her~value)

say "Now she is a Wife:"
say "  her =" her
say "  life = her + me  (this one starts a timer)..."

life = her + me

say "  life =" life
say "  (something may arrive in ~5 seconds...)"
say


/* Fourth offence: UNKNOWN + dynamic method surgery */

say "Calling a method that does not exist..."

life~makeTeaWith("Earl Grey", "hot")

say


/* Fifth offence: remove Wife's '+' implementation */

say "Removing the '+' method from Wife at runtime..."

.Wife~define("+", .nil)

say "Trying 'life = her + me' one last time..."
say "Wife no longer supplies '+', so inheritance takes over."

life = her + me

say "  life =" life
say

say "Program finished. Reality may continue without us."

exit


/* ============================================================
  CLASSES
  ============================================================ */


::class Me

::attribute value

::method init
  expose value
  use arg value

::method string
  expose value
  return "Me(" || value || ")"

::method makestring
  forward message ("string")

::method "+"
  /* me + anything returns me, because narcissism */
  return self



::class Woman

::attribute value

::method init
  expose value
  use arg value

::method string
  expose value
  return "Woman(" || value || ")"

::method makestring
  forward message ("string")

::method "+"
  use arg other

  if other~isA(.Me) then
  return .Couple~new(self, other)

  return self



::class Girlfriend subclass Woman

::method string
  /*
  VALUE belongs to Woman's object-variable scope.
  Use the inherited accessor rather than EXPOSE here.
  */
  return "Girlfriend(" || self~value || ")"

::method "+"
  use arg other

  if other~isA(.Me) then
  return .Family~new(self, other)

  return self



::class Wife subclass Girlfriend

::method string
  return "Wife(" || self~value || ")"

::method "+"
  use arg other

  if other~isA(.Me) then do

     fam = .Family~new(self, other)

    /*
      Schedule a side effect five seconds later.
    */
    .Alarm~new(5, .Message~new(fam, "addBaby"))

    return fam
  end

  return self



::class Couple

::attribute her
::attribute me

::method init
  expose her me
  use arg her, me

::method string
  expose her me

  return "Couple{" || her~value || -
      " + " || me~value || "}"

::method makestring
  forward message ("string")

::method value
  expose her me

  return her~value "and" me~value



::class Family subclass Couple

::attribute baby

::method init
  expose her me baby
  use arg her, me

  baby = .nil


::method string
  expose her me baby

  if baby \= .nil then
    return "Family{" || her~value || -
        " + " || me~value || -
        " + " || baby || "}"

  return "Family{" || her~value || -
      " + " || me~value || "} (expecting...)"


::method makestring
  forward message ("string")


::method value
  expose her me baby

  if baby \= .nil then
    return her~value"," me~value "and" baby

  return her~value "and" me~value "(still waiting)"


::method addBaby
  expose baby

  baby = .Baby~new("Surprise!")

  say
  say ">>> 5 seconds later: a baby appeared! <<<"
  say ">>> Current family state:" self
  say


  /*
  * UNKNOWN belongs here because the object receiving
  * makeTeaWith is a Family.
  */
::method unknown
  use arg msg, args

  say "  [UNKNOWN] Family received message '"msg"'"
  say "            with args:" args~toString

  /*
  * Install the previously nonexistent method
  * on THIS PARTICULAR OBJECT.
  */
  self~setMethod("makeTeaWith", -
    'use arg tea, temp;' -
    'say "  Serving" tea "("temp") to the family.";' -
    'return self')

  /*
  * Now resend the original message.
  * This time the method exists.
  */
  return self~sendWith(msg, args)



::class Baby

::attribute value

::method init
  expose value
  use arg value

::method string
  expose value
  return "Baby(" || value || ")"

::method makestring
  forward message ("string")

