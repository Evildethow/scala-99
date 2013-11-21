package org.evildethow


import org.scalatest.FunSuite
import org.evildethow.P01.last


class PO1Test extends FunSuite {

  test ("Invoking last on list returns last item") {
    assert(last(List(1, 1, 2, 3, 5, 8)) == 8)
  }
}
