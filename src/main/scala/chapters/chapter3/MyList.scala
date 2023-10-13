package chapters.chapter3

enum MyList[+A]:
  case Nil
  case Cons(head: A, tail: MyList[A])

object MyList:
  def apply[A](as: A*): MyList[A] =
    if as.isEmpty then Nil
    else Cons(as.head, apply(as.tail*))

  def sum(ints: MyList[Int]): Int = ints match
    case Nil         => 0
    case Cons(x, xs) => x + sum(xs)

  def tail[A](xs: MyList[A]): MyList[A] = xs match
    case Nil           => Nil
    case Cons(_, tail) => tail

  def setHead[A](xs: MyList[A], h: A): MyList[A] = xs match
    case Nil           => Nil
    case Cons(_, tail) => Cons(h, tail)

  def drop[A](xs: MyList[A], d: Int): MyList[A] = (xs, d) match
    case (Nil, _)           => Nil
    case (_, 0)             => xs
    case (Cons(_, tail), d) => drop(tail, d - 1)

  def dropWhile[A](xs: MyList[A], p: A => Boolean): MyList[A] = xs match
    case Nil                   => Nil
    case Cons(h, tail) if p(h) => dropWhile(tail, p)
    case xs                    => xs

  def init[A](xs: List[A]): List[A] = xs match
    case Nil => Nil
    case Cons()
