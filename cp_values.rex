#!/usr/bin/env regina
/* Rexx */

isTrue  = (1 == 1)
isFalse = (\isTrue)
boolean = (isTrue isFalse)

k_large = 100000
k_mid   = k_large / 2

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8

say 'pool' poolid()
call main

exit

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
main:
  procedure expose (boolean)
  say

  say 'main: pool' poolid()
  kl = value('K_LARGE',, poolid() - 1)
  say 'K_LARGE =' kl
  km = value('k_mid',, 'CALLER')
  say 'k_mid =' km

  user = ''
  user = value('USER',, 'ENVIRONMENT')
  say 'USER '''user''' from ENVIRONMENT'

  user = ''
  user = value('USER',, 'OS2ENVIRONMENT')
  say 'USER '''user''' from OS2ENVIRONMENT'

  user = ''
  user = value('USER',, 'SYSTEM')
  say 'USER '''user''' from SYSTEM'

  call sub1

  env_var = 'AS_TEST'
  var = fun1(env_var)
  say 'var:' var
  say

  return

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
sub1:
  procedure expose (boolean)
  say

  say 'sub1: pool' poolid()
  kl = value('K_LARGE',, 1)
  say 'K_LARGE =' kl
  km = value('k_mid',, 1)
  say 'k_mid =' km

  cp = value('CLASSPATH',, 'ENVIRONMENT')
  say 'CLASSPATH='cp

  jcp. = ''
  jcp.0 = 0
  do while length(cp) > 0
    parse value cp with pv ':' cp
    ix = jcp.0 + 1; jcp.0 = ix; jcp.ix = pv
  end

  say
  say 'CLASSPATH:'
  do jj = 1 to jcp.0
    if jcp.jj = '.' then
      say '    'jcp.jj '    [<- ''.'' == current directory]'
    else
      say '    'jcp.jj
  end jj
  say

  return

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
fun1:
  procedure expose (boolean)
  say 'fun1(): pool' poolid()

  parse arg env_var . 0 farg
  say 'arg:' farg
  say

  val = ''
  newval = 'sammo'

--env = 'ENVIRONMENT'
--env = 'OS2ENVIRONMENT'
  env = 'SYSTEM'

  val = value(env_var,, env)
  if length(val) = 0 then do -- env var not set
    ? = value(env_var, newval, env)
    val = value(env_var,, env)
    say env_var 'now set to' val '['?']'
    call export env_var newval
  end
  else if val \= newval then do -- env var not what we need
    ? = value(env_var, newval, env)
    val = value(env_var,, env)
    say env_var 'set to' val '['?']'
    call export env_var newval
  end
  else -- env var already what we need
    say env_var 'already set to' val
    nop

  say var':' val
  say

  return val

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
export:
  procedure expose (boolean)
  say 'export: pool' poolid()

  parse arg env_var env_val . 0 farg
  say 'arg:' farg '-' env_var env_val

  say 'SYSTEM' 'export 'env_var'='env_val
  address 'SYSTEM' 'export 'env_var'='env_val

  return

