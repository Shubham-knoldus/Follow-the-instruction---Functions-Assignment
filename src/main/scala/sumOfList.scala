trait SumListElement[list]{
  def sumOfList(list: List[Int]):Int
  def apply(list:List[Int]): Int
}

object sumOfList extends App{

  val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
  def apply(list:List[Int]): Int ={
    if (list.isEmpty) 0
    else{
      val sum =list.head + apply(list.tail)
      sum
    }
  }
  println(sumOfList.apply(List(0, 1, 0, 9, 16, 25)))
}
