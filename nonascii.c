
#include <stdio.h>
#include <stdlib.h>

#include "nonascii.h"

int main(int argc, char const * argv[]) {
  unsigned char ascii_range[nonascii_txt_len];
  unsigned char specials[nonascii_txt_len];
  [[maybe_unused]]
  size_t ascii_range_sz = 0ul;
  [[maybe_unused]]
  size_t specials_sz = 0ul;

  for (size_t ix = 0ul, ax = 0ul, sx = 0ul; ix < nonascii_txt_len; ++ix) {
    if (nonascii_txt[ix] >= 0x20 && nonascii_txt[ix] <= 0x7e) {
      ascii_range[ax] = nonascii_txt[ix];
      ascii_range_sz = ax++;
    }
    else  {
      specials[sx] = nonascii_txt[ix];
      specials_sz = sx++;
    }
  }

  printf("%s\n", ascii_range);

  size_t count = 1ul;
  for (size_t sx = 0ul; sx < specials_sz; ++sx) {
    printf("%02x ", specials[sx]);
    if (count++ % 8 == 0ul) {
      putchar('\n');
      count = 1ul;
    } 
  }
  putchar('\n');

  return EXIT_SUCCESS;
}

