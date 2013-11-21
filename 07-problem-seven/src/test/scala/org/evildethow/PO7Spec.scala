package org.evildethow

import org.scalatest.FlatSpec
import org.evildethow.PO7._

class PO7Spec extends FlatSpec {

  "Invoking flatten on a list containing list components" should "return single list with all elements" in {
    assert(flatten(List(List(1, 1), List(3, List(5, 8)))) == List(1, 1, 3, 5, 8))
  }

  "Invoking flatten on a list containing list and non list components" should "return single list with all elements" in {
    assert(flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }

  "Invoking flatten on a list containing list and non list components of multiple types" should "return single list with all elements" in {
    assert(flatten(List(List(1, "one"), 2, List(3, List(5, 8)))) == List(1, "one", 2, 3, 5, 8))
  }

  "Invoking flatten on Nil" should "return Nil" in {
    assert(flatten(Nil) == Nil)
  }
}
