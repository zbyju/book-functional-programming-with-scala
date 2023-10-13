import chapters.chapter2.*
import chapters.chapter3.*

@main def hello: Unit =
  (0 to 6).foreach(i => {
    println(fibTail(i))
  })

  println(isSorted(Array(1, 2, 3), _ > _) == true)
  println(isSorted(Array(1, 2, 1), _ > _) == false)
  println(isSorted(Array(3, 2, 1), _ < _) == true)
  println(isSorted(Array(1, 2, 3), _ < _) == false)

  val l = MyList(1, 2, 3)
  println(MyList.sum(l))
