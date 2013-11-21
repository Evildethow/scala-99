package org.evildethow

import org.scalatest.FlatSpec
import org.evildethow.PO5._

class PO5Spec extends FlatSpec {

  "Invoking reverse on list" should "return a list in reverse order" in {
    assert(reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
  }

  "Invoking reverse on Nil list" should "return a Nil list" in {
    assert(reverse(Nil) == Nil)
  }
}
