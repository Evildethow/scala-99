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
#### Example ####
```scala
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
```
#### Solution ####
```scala
def last[A](ls: List[A]): A = ls.last
```

## Problem Two ##
### (*) Find the last but one element of a list. ###
#### Example: ####
```scala
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
```
#### Solution ####
```scala
def penultimate[A](ls: List[A]): A =
    if (ls.isEmpty) throw new UnsupportedOperationException("empty.list")
    else ls.init.last
```

## Problem Three ##
### (*) Find the Kth element of a list. ###
By convention, the first element in the list is element 0.
#### Example: ####
```scala
scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
```
#### Solution ####
```scala
def nth[A](pos: Int, ls: List[A]): A =
    if (ls.isEmpty || pos > ls.length || pos < 0) throw new UnsupportedOperationException("empty.list")
    else ls(pos)
```

## Problem Four ##
### Find the number of elements of a list. ###
#### Example: ####
```scala
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
```
#### Solution ####
```scala
def length[A](ls: List[A]): Int = ls.length
```

## Problem Five ##
### (*) Reverse a list. ###
#### Example: ####
```scala
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
```
#### Solution ####
```scala
def reverse[A](ls: List[A]): List[A] = ls.reverse
```

## Problem Six ##
### (*) Find out whether a list is a palindrome. ###
#### Example: ####
```scala
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
```
#### Solution ####
```scala
def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse
```

## Problem Seven ##
### (**) Flatten a nested list structure. ###
#### Example: ####
```scala
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
```
#### Solution ####
```scala
def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
}
```

## Problem Eight ##
### (**) Eliminate consecutive duplicates of list elements. ###
If a list contains repeated elements they should be replaced with a single copy of the element.
The order of the elements should not be changed.
#### Example: ####
```scala
scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
```
#### Solution ####
```scala
def compress[A](ls: List[A]): List[A] =
    ls.foldRight(List[A]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }
```

## Problem Nine ##
### (**) Pack consecutive duplicates of list elements into sublists. ###
If a list contains repeated elements they should be placed in separate sublists.
#### Example: ####
```scala
scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
```
#### Solution ####
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
### (*) Run-length encoding of a list. ###
Use the result of problem P09 to implement the so-called run-length encoding data compression method.
Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
#### Example: ####
```scala
scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```
#### Solution ####
```scala
import PO9.pack
  def encode[A](ls: List[A]): List[(Int, A)] =
    pack(ls) map { e => (e.length, e.head) }
```

## Contact ##

- Owen Wood
- <a href="evildethow@gmail.com">evildethow@gmail.com</a>
