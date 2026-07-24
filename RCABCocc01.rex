#!/usr/bin/env rexx
/* Rexx */
-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
--main:
  parse value 'A B C' with A B C
  data. = ''
  data.0 = 0
  call getdata

  loop _i = 1 to data.0
    counts. = ''
    occ = data._i~lower
    if isABC(occ) then do
      say data._i~right(40) ': occurences:' counts.A
    end
  end _i

exit

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
isABC: procedure expose counts.
  parse value 'A B C' with A B C
  parse arg occ
  parse value counting(occ) with ':'ret':'ayys':'bees':'cees':' .
  counts.A = ayys
  counts.B = bees
  counts.C = cees
  return ret

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
counting: procedure
  parse arg occ
  ayys = occ~countstr('a')
  bees = occ~countstr('b')
  cees = occ~countstr('c')

  if (ayys > 0) & (ayys == bees & bees == cees) then
    matches = .true
  else
    matches = .false

  return ':'matches':'ayys':'bees':'cees':'

exit

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
getdata: procedure expose data.

  _x = data.0 + 1; data.0 = _x; data._x = 'aluminium'
  _x = data.0 + 1; data.0 = _x; data._x = 'abc'
  _x = data.0 + 1; data.0 = _x; data._x = 'internet'
  _x = data.0 + 1; data.0 = _x; data._x = 'adb'
  _x = data.0 + 1; data.0 = _x; data._x = 'cda'
  _x = data.0 + 1; data.0 = _x; data._x = 'blank'
  _x = data.0 + 1; data.0 = _x; data._x = 'black'
  _x = data.0 + 1; data.0 = _x; data._x = 'mercury'
  _x = data.0 + 1; data.0 = _x; data._x = 'venus'
  _x = data.0 + 1; data.0 = _x; data._x = 'earth'
  _x = data.0 + 1; data.0 = _x; data._x = 'mars'
  _x = data.0 + 1; data.0 = _x; data._x = 'jupiter'
  _x = data.0 + 1; data.0 = _x; data._x = 'saturn'
  _x = data.0 + 1; data.0 = _x; data._x = 'uranus'
  _x = data.0 + 1; data.0 = _x; data._x = 'neptune'
  _x = data.0 + 1; data.0 = _x; data._x = 'pluto'
  _x = data.0 + 1; data.0 = _x; data._x = 'Abacab Cbc'

  return

exit

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8

