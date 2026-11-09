
#include <iostream>
#include <print>

using namespace std::string_literals;

void f_or(bool, bool);
void f_nor(bool, bool);
void f_xor(bool, bool);
void f_and(bool, bool);
void f_nand(bool, bool);
void f_not(bool);

static
auto constexpr _o = "\u2228"s; /*   OR: ∨ - U+00AC */
static
auto constexpr no = "\u22bd"s; /*  NOR: ⊻ - U+22BD */
static
auto constexpr xo = "\u22bb"s; /*  XOR: ⊻ - U+22BB */
static
auto constexpr nd = "\u2227"s; /*  AND: ∧ - U+2227 */
static
auto constexpr nn = "\u22BC"s; /* NAND: ⊼ - U+22BC */
static
auto constexpr nt = "\u00ac"s; /*  NOT: ¬ - U+00AC */

/**
 *  Main entry point
 */
int main(int argc, char const * argv[]) {

  auto _t = true;
  auto _f = false;

  std::cout << "  OR:\n"s; 
  f_or(_t, _t);
  f_or(_t, _f);
  f_or(_f, _t);
  f_or(_f, _f);
  std::cout << std::endl;

  std::cout << "  NOR:\n"s; 
  f_nor(_t, _t);
  f_nor(_t, _f);
  f_nor(_f, _t);
  f_nor(_f, _f);
  std::cout << std::endl;

  std::cout << "  XOR:\n"s; 
  f_xor(_t, _t);
  f_xor(_t, _f);
  f_xor(_f, _t);
  f_xor(_f, _f);
  std::cout << std::endl;

  std::cout << "  AND:\n"s; 
  f_and(_t, _t);
  f_and(_t, _f);
  f_and(_f, _t);
  f_and(_f, _f);
  std::cout << std::endl;

  std::cout << "  NAND:\n"s; 
  f_nand(_t, _t);
  f_nand(_t, _f);
  f_nand(_f, _t);
  f_nand(_f, _f);
  std::cout << std::endl;

  std::cout << "  NOT:\n"s; 
  f_not(_t);
  f_not(_f);
  std::cout << std::endl;

  return 0;
}

/**
 *
 */
void f_or(bool lhs, bool rhs) {
  std::cout << "    "s
    << lhs
    << ' ' << _o << ' '
    << rhs
    << " | "
    << (lhs or rhs)
    << '\n';

  return;
}

/**
 *
 */
void f_nor(bool lhs, bool rhs) {
  std::cout << "    "s
    << lhs
    << ' ' << no << ' '
    << rhs
    << " | "
    << (not (lhs or rhs))
    << '\n';

  return;
}

/**
 *
 */
void f_xor(bool lhs, bool rhs) {
  std::cout << "    "s
    << lhs
    << ' ' << xo << ' '
    << rhs
    << " | "
    << (lhs xor rhs)
    << '\n';

  return;
}

/**
 *
 */
void f_and(bool lhs, bool rhs) {
  std::cout << "    "s
    << lhs
    << ' ' << nd << ' '
    << rhs
    << " | "
    << (lhs and rhs)
    << '\n';

  return;
}

/**
 *
 */
void f_nand(bool lhs, bool rhs) {
  std::cout << "    "s
    << lhs
    << ' ' << nn << ' '
    << rhs
    << " | "
    << (not (lhs and rhs))
    << '\n';

  return;
}

/**
 *
 */
void f_not(bool lhs) {
  std::cout << "    "s
    << nt
    << lhs
    << " | "
    << (not lhs)
    << '\n';

  return;
}

