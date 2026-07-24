#!/usr/bin/env rexx
/* Rexx */
-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
  parse arg . '-l' literal,
          0 . '-f' file_name .
  select
    when literal~length > 0 then do
      str = literal~strip
      dic_file = ''
    end
    when file_name~length > 0 then do
      dict_file = file_name~strip
      str = ''
    end
    otherwise do
      dict_file = './data/unixdict.txt'
      str = ''
    end
  end

  tbl = xrange('print')
  tbl = tbl~translate('       ', 'ABCabc')

  occurs. = ''; occurs.0 = 0

  if str~length = 0 | str = '.' then do

    loop label eof while lines(dict_file)
      str = linein(dict_file)
      occ = str~lower
      occ = occ~translate(' ', tbl)
      if occ~strip~length = 0 then
        iterate eof
      call stripping occ
    end eof
    if occurs.0 = 0 then do
      occurs.0 = 1
      occurs.1 = 'no strings in' dict_file 'meet criteria.'
    end
  end
  else do
    say '!!!' str~lower~countstr('a')
    say '!!!' str~lower~countstr('b')
    say '!!!' str~lower~countstr('c')
    occ = str~lower
    occ = occ~translate(' ', tbl)
    if occ~strip~length > 0 then
      call stripping occ
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

exit

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
stripping: procedure,
  expose occurs. str

  parse arg occ

  ayy_l = 0; bee_l = 0; cee_l = 0
  ayy_l = stripper(occ~translate('a  ', 'abc'))~length
  if ayy_l > 0 then do
    bee_l = stripper(occ~translate(' b ', 'abc'))~length
    if bee_l > 0 then do
      cee_l = stripper(occ~translate('  c', 'abc'))~length
    end
  end
  if ayy_l > 0 & bee_l > 0 & cee_l > 0 then do
    if ayy_l = bee_l & bee_l = cee_l then do
      _x = occurs.0 + 1; occurs.0 = _x; occurs._x =,
           str ":" ayy_l~right(3)',' bee_l~right(3)',' cee_l~right(3)
    end
  end

  return

exit

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
stripper: procedure
  parse arg clothed
  clothed = clothed~strip
  stripped = ''
  loop label undress while clothed~length > 0
    stripped = stripped || clothed~substr(1, 1)
    clothed = clothed~substr(2)
    clothed = clothed~strip('l')
  end undress

  return stripped

exit

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8

