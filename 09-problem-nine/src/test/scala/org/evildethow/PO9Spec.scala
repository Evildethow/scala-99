package org.evildethow

import org.scalatest.FlatSpec
import org.evildethow.PO9._

class PO9Spec extends FlatSpec {

  "Invoking pack on a list containing consecutive duplicates" should
    "return a list of sub-lists, each containing repeated elements" in {
    assert(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
      List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  "Invoking pack on a Nil list" should "return a list of Nil" in {
    assert(pack(Nil) == List(Nil))
  }
}
