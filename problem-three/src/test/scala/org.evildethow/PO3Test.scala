package org.evildethow

import org.scalatest.FunSuite
import org.evildethow.PO3.nth

class PO3Test extends FunSuite {

  test("Invoking nth on list returns nth item") {
    assert(nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
  }
}
