#!/usr/bin/env regina
/* Rexx */

cp = value('CLASSPATH',, 'SYSTEM')
say cp

ret = 0
if cp = '' then ret = 8

exit ret

