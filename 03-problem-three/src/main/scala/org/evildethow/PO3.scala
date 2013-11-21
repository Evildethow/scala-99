package org.evildethow

object PO3 {
  def nth[A](pos: Int, ls: List[A]): A =
    if (ls.isEmpty || pos > ls.length || pos < 0) throw new UnsupportedOperationException("empty.list")
    else ls(pos)
}
