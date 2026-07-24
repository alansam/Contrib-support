#!/usr/bin/env regina
/* Rexx */
/*
say
parse value (Code Golf) with ? ! .
say substr(?, 1, 1)lower(substr(?, 2)),
    substr(!, 1, 1)lower(substr(!, 2))
say
say left(?, 1)lower(right(?, 3)),
    left(!, 1)lower(right(!, 3))
say
say lower(?, 2) lower(!, 2)
say
*/

-- two-liner
say
parse value (code golf) with ? ! .
say lower(?, 2) lower(!, 2)
say

push 20
push 16
push 12
push 8
push 4
push 0

do while queued() > 0
  parse pull qrc .
  njprc = (qrc <> 12)
  cmsrc = (qrc \= 12 & qrc \= 8)
  say '    RC='right(qrc, 2)',',
      'njp RC='right(qrc * njprc, 2) '['njprc'],',
      'CMS RC='right(qrc * cmsrc, 2) '['cmsrc'].'
end
say

exit

