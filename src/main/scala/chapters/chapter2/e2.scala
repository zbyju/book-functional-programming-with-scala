package chapters.chapter2

def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean =
  def go(i: Int): Boolean =
    if i + 1 >= as.length then true
    else if gt(as(i), as(i + 1)) then false
    else go(i + 1)

  go(0)
