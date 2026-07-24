#!/usr/bin/env rexx
/* Rexx */
-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
  exitCd = 0

  parse arg . '-l' literal 0 . '-f' file_name . 0 opt .

  select
    when literal~length > 0 then do
      str = literal~strip
      dict_file = ''
    end

    when file_name~length > 0 then do
      if file_name = '.' then do
        dict_file = './data/unixdict.txt'
      end
      else if file_name = '--' then do
        dict_file = '' -- input taken from .STDIN
      end
      else do
        dict_file = file_name~strip
      end
      str = ''
    end

    otherwise do
      opt = opt~strip
      if opt~length = 0 | opt = '--' then do
        dict_file = '' -- input taken from .STDIN
        str = ''
      end
      else do
        if opt = '-f' then
          say 'option '''opt''' requires a file name; exiting'
        else
          say 'option '''opt''' not recognized; exiting.'
        exitCd = 4
      end
    end
  end
  if exitCd \= 0 then exit exitCd

  occurs. = ''; occurs.0 = 0

  if str~length = 0 | str = '.' then do
    if dict_file~length > 0 then _fn = dict_file
    else _fn = '.STDIN'
    say 'reading strings from '''_fn''''

    loop label eof while lines(dict_file)
      str = linein(dict_file)
      occ = str~lower
      counts. = 0
      if isABC(occ) then do
        _c = occurs.0 + 1; occurs.0 = _c; occurs._c = str ':' counts.A -- .A, .B, & .C are equal
      end
    end eof
    if occurs.0 = 0 then do
      occurs.0 = 1
      if dict_file~length = 0 then dict_file = '.STDIN'
      occurs.1 = 'no strings in '''dict_file''' meet criteria'
    end
  end
  else do
    occ = str~lower
    counts. = 0
    if isABC(occ) then do
      _c = occurs.0 + 1; occurs.0 = _c; occurs._c = str ':' counts.A -- .A, .B, & .C are equal
    end
    else do
      occurs.0 = 1
      occurs.1 = ''''str''' does not meet criteria.'
    end
    if occurs.0 = 0 then do
      occurs.0 = 1
      occurs.1 = ''''str''' does not meet criteria.'
    end
  end

  loop _s = 1 to occurs.0
    rl = 40
    if occurs._s~length > 40 then
      rl = occurs._s~length

    say occurs._s~right(rl)
  end _s
  say

exit exitCd

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
isABC:procedure expose counts.
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

