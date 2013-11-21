package org.evildethow

import org.scalatest.FlatSpec
import org.evildethow.PO4._

class PO4Spec extends FlatSpec {

  "Invoking length on list" should "return the list length" in {
    assert(length(List(1, 1, 2, 3, 5, 8)) == 6)
  }

  "Invoking length on Nil list" should "return 0" in {
    assert(length(Nil) == 0)
  }
}
