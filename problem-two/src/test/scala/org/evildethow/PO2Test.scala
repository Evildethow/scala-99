package org.evildethow

import org.scalatest.FunSuite
import org.evildethow.PO2.penultimate

class PO2Test extends FunSuite {

  test("Invoking penultimate on list returns last but one item") {
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
  }
}
