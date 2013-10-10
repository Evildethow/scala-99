# scala-99 #

## Build & run ##

```sh
$ cd scala-99
$ chmod u+x sbt
$ ./sbt test
```

## Create Idea Project ##
```sh
$ cd scala-99
$ ./sbt gen-idea
```

## Problem One ##
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

## Contact ##

- Owen Wood
- <a href="evildethow@gmail.com">evildethow@gmail.com</a>
