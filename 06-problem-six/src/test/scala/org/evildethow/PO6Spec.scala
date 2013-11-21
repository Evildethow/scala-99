package org.evildethow

import org.scalatest.FlatSpec
import org.evildethow.PO6._

class PO6Spec extends FlatSpec {

  "Invoking isPalindrome on list" should "return true" in {
    assert(isPalindrome(List(1, 2, 3, 2, 1)))
  }

  "Invoking isPalindrome on list" should "return false" in {
    assert(!isPalindrome(List(1, 2, 3, 4, 5)))
  }

  "Invoking isPalindrome on Nil list" should "return true" in {
    assert(isPalindrome(Nil))
  }
}
