package org.evildethow

import org.scalatest.FlatSpec
import PO10._


class PO10Spec extends FlatSpec {

  "Invoking encode on a list containing consecutive duplicates" should
    "return a list of tuples (N, E) where N is the number of duplicates of the element E " in {
    assert(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
      List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
}
