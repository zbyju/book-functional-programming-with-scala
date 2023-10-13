package chapters.chapter2

def fibTail(n: Int): Int =
  @annotation.tailrec
  def go(n: Int, x: Int, y: Int): Int =
    if n <= 0 then x
    else go(n - 1, y, x + y)

  go(n, 0, 1)
