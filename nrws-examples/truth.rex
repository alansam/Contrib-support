#!/usr/bin/env rexx
/* Rexx */
say ' ... ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8'
ab.    = ''
ab.1.1 = 1; ab.1.2 = 1;
ab.2.1 = 1; ab.2.2 = 0;
ab.3.1 = 0; ab.3.2 = 1;
ab.4.1 = 0; ab.4.2 = 0;
ab.0   = 4

_o = 'e288a8'x; --   OR: ∨ - U+2228, UTF-8: 0xE2 0x88 0xA8
no = 'e28abd'x; --  NOR: ⊻ - U+22BD, UTF-8: 0xE2 0x8A 0xBD
xo = 'e28abb'x; --  XOR: ⊻ - U+22BB, UTF-8: 0xE2 0x8A 0xBB
nd = 'e288a7'x; --  AND: ∧ - U+2227, UTF-8: 0xE2 0x88 0xA7
nn = 'e28abc'x; -- NAND: ⊼ - U+22BC, UTF-8: 0xE2 0x8A 0xBC
nt = 'c2ac'x;   --  NOT: ¬ - U+00AC, UTF-8: 0xC2 0xAC

say 'truth table for OR  ';
loop _e = 1 to ab.0;
  say ab._e.1 _o ab._e.2 ':'   (ab._e.1 |  ab._e.2);
end _e;
say;

say 'truth table for NOR ';
loop _e = 1 to ab.0;
  say ab._e.1 no ab._e.2 ':' (\(ab._e.1 |  ab._e.2));
end _e;
say;

say 'truth table for XOR ';
loop _e = 1 to ab.0;
  say ab._e.1 xo ab._e.2 ':'   (ab._e.1 && ab._e.2);
end _e;
say;

say 'truth table for AND ';
loop _e = 1 to ab.0;
  say ab._e.1 nd ab._e.2 ':'   (ab._e.1 &  ab._e.2);
end _e;
say;

say 'truth table for NAND';
loop _e = 1 to ab.0;
  say ab._e.1 nn ab._e.2 ':' (\(ab._e.1 &  ab._e.2));
end _e;
say;

say 'truth table for NOT ';
loop _e = 2 to 3;
  say nt||ab._e.1 ':'   (      \  ab._e.1);
end _e;
say;

