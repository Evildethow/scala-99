package org.evildethow

import org.scalatest.FlatSpec
import org.evildethow.PO8._

class PO8Spec extends FlatSpec {

  "Invoking compress on a list containing consecutive duplicates" should "return a list containing none" in {
    assert(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
  }

  "Invoking compress on a Nil" should "return Nil" in {
    assert(compress(Nil) == Nil)
  }
}
