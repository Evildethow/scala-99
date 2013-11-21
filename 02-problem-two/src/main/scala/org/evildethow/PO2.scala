package org.evildethow

object PO2 {
  def penultimate[A](ls: List[A]): A =
    if (ls.isEmpty) throw new UnsupportedOperationException("empty.list")
    else ls.init.last
}
