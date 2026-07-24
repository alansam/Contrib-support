#!/usr/bin/env rexx
/*REXX program verifies that all characters in a string are all the same (character). */
!chr = '     [character'                            /* define a literal used for  SAY.*/
!all = 'all the same character for string (length'  /*    "   "    "     "    "    "  */

parse arg in_str                      /*obtain optional argument from the CL.*/

!str. = ''
if in_str \= '' then
  !str.1 = in_str                     /*if user specified an arg, use that.  */
else do
  !str.1 = ''                         /*use this null string if no arg given.*/
  !str.2 = '   '                      /* "    "          "    "  "  "    "   */
  !str.3 = 2                          /* "    "          "    "  "  "    "   */
  !str.4 = 333                        /* "    "          "    "  "  "    "   */
  !str.5 = .55                        /* "    "          "    "  "  "    "   */
  !str.6 = 'tttTTT'                   /* "    "          "    "  "  "    "   */
  !str.7 = 4444 444k                  /* "    "          "    "  "  "    "   */
end                                   /* [^]  seventh value contains a blank.*/

do jx = 1
  L_str = length(!str.jx)             /*obtain the length of an array element*/
  if jx > 1 & L_str == 0 then
    leave jx                          /*if arg is null and  J>1, then leave. */
  chr_pos = allSame(!str.jx)          /*R:  =0,  or the location of bad char.*/
  if chr_pos \== 0 then
    ?chr= substr(!str.jx, chr_pos, 1) /*if  not  monolithic, obtain the char.*/
  if chr_pos == 0 then
    say '   ' !all L_str"):" !str.jx
  else
    say 'not' !all L_str"):" !str.jx !chr "'"?chr"' ('"c2x(?chr)"'x)  at position" chr_pos"]."
end jx

exit                                /*stick a fork in it,  we're all done. */

/*--------------------------------------------------------------------------------------*/
allSame: procedure
  parse arg str                           /*get a value from the argument list.  */
  if str == '' then
    return 0                              /*if  Y  is null,  then return 0 (zero)*/
                                          /*                else  return location*/
  return verify(str, left(str, 1))        /*All chars the same?   Return 0 (zero)*/
                                          /*                else  return location*/

