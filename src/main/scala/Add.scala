trait Addition[+A, +B] {
  def add(x: Int,y:Int):Int
  def apply(x: Int, y: Int): Int
}

object Add extends App {

  val add: (Int, Int) => Int = (x: Int, y: Int) => x + y
  def apply(x: Int, y: Int): Int = x + y
  println(add.apply(5,10))

}
