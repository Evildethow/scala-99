# scala-99 #

## Build & Run ##

```sh
$ cd scala-99
$ chmod u+x sbt
$ ./sbt test
```

## Create IDEA Project ##
```sh
$ cd scala-99
$ ./sbt gen-idea
```

## Problem One ##
### (*) Find the last element of a list. ###
Example:
```scala
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
```
Solution:
```scala
def last[A](ls: List[A]): A = ls.last
```

## Problem Two ##
```scala
def penultimate[A](ls: List[A]): A =
    if (ls.isEmpty) throw new UnsupportedOperationException("empty.list")
    else ls.init.last
```

## Problem Three ##
```scala
def nth[A](pos: Int, ls: List[A]): A =
    if (ls.isEmpty || pos > ls.length || pos < 0) throw new UnsupportedOperationException("empty.list")
    else ls(pos)
```

## Problem Four ##
```scala
def length[A](ls: List[A]): Int = ls.length
```

## Problem Five ##
```scala
def reverse[A](ls: List[A]): List[A] = ls.reverse
```

## Problem Six ##
```scala
def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse
```

## Problem Seven ##
```scala
def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
}
```

## Problem Eight ##
```scala
def compress[A](ls: List[A]): List[A] =
    ls.foldRight(List[A]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }
```

## Problem Nine ##
```scala
def pack[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span {
        _ == ls.head
      }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
}
```

## Problem Ten ##
```scala
import PO9.pack
  def encode[A](ls: List[A]): List[(Int, A)] =
    pack(ls) map { e => (e.length, e.head) }
```

## Contact ##

- Owen Wood
- <a href="evildethow@gmail.com">evildethow@gmail.com</a>
