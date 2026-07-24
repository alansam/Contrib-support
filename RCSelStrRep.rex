#!/usr/bin/env regina
/* Rexx */

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
  true  = (1 == 1)
  false = \true
  boolean = 'true false'

  sample = "abracadabra"
  ?.  = ''
  ?.0 = 8
  ?.1 = 'a A' -- 1st a
  ?.2 = 'a B' -- 2nd a
  ?.3 = 'a @' -- skip
  ?.4 = 'a C' -- 4th a
  ?.5 = 'a D' -- 5th a
  ?.6 = 'b E' -- 1st b
  ?.7 = 'r $' -- skip
  ?.8 = 'r F' -- 2nd r

  target = sample
  do ix = 1 to ?.0
    parse var ?.ix chs chn .
    loc = pos(chs, target)
    if loc <> 0 then
      target = overlay(chn, target, loc, 1)
  end ix
  target = translate(target, 'ar', '@$')

  check = "AErBcadCbFD"
  say ' ' sample
  say ' ' target
  if compare(target, check) = 0 then
    say '  Success!'
  say

  call parseSolution sample, check

  return

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
parseSolution:
  procedure expose (boolean)

  parse arg sample ., check .

  !. = ''
  parse value 'A B a C D E r F' with !.a1 !.a2 !.a3 !.a4 !.a5 !.b1 !.r1 !.r2

  say ' ' sample
  parse var sample p1 'a' p2 'a' p3 'a' p4 'a' p5 'a' p6
  target = p1 || !.a1 || p2 || !.a2 || p3 || !.a3 || p4 || !.a4 || p5  || !.a5 || p6

  parse var target q1 'b' q2
  target = q1 || !.b1 || q2

  parse var target o1 'r' o2 'r' o3
  target = o1 || !.r1 || o2 || !.r2 || o3
  say ' ' target

  if compare(target, check) = 0 then
    say '  Success!'
  say

  return

/*
 ... ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
This is admittedly a trivial task but I thought it would be interesting to see
how succinctly (or otherwise) different languages can handle it.

Given the string: "abracadabra", replace programatically:

the first  'a' with 'A'
the second 'a' with 'B'
the fourth 'a' with 'C'
the fifth  'a' with 'D'
the first  'b' with 'E'
the second 'r' with 'F'

Note that there is no replacement for the third 'a', second 'b' or first 'r'.

The answer should, of course, be : "AErBcadCbFD".
 ... ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 */

