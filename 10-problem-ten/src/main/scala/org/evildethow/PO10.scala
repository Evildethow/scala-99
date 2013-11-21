package org.evildethow

object PO10 {
  import PO9.pack
  def encode[A](ls: List[A]): List[(Int, A)] =
    pack(ls) map { e => (e.length, e.head) }
}
