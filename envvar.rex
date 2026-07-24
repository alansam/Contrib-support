#!/usr/bin/env regina
/* NetRexx */

--trace ?r;nop

--COLUMNS = 131
--LINES = 34
  do 2
    say copies('.', 60)
    call env
    say
    COLUMNS = 80
  end

  exit

env:
  procedure expose COLUMNS

  ecols = value('COLUMNS',, 'ENVIRONMENT')
  scols = value('COLUMNS',, 'SYSTEM')
  ccols = value('COLUMNS',, 'CALLER')
  rcols = value('COLUMNS')

  say 'ENVIRONMENT:' ''''ecols'''' 'SYSTEM:' ''''scols'''',
      'CALLER:'      ''''ccols'''' '"":'     ''''rcols''''
  say
  say 'Address SYSTEM:'
  address SYSTEM 'echo $COLUMNS 2>&1' with output stem echo.
  if echo.0 > 0 then
    do ix = 1 to echo.0
      say 'echo.'ix': '''echo.ix''''
    end ix

  say
  say 'Address COMMAND:'
  address COMMAND 'echo $COLUMNS 2>&1' with output stem echo.
  if echo.0 > 0 then
    do ix = 1 to echo.0
      say 'echo.'ix': '''echo.ix''''
    end ix

  return

