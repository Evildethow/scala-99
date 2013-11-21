package org.evildethow

import org.scalatest.FlatSpec
import org.evildethow.PO3._

class PO3Spec extends FlatSpec {

  "Invoking nth on list" should "return nth item" in {
    assert(nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
  }

  "Invoking nth on empty list" should "produce UnsupportedOperationException" in {
    intercept[UnsupportedOperationException] {
      nth(1, List())
    }
  }
}
