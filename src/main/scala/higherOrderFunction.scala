trait HighOrdFunc {

  def higherOrderFunction(f: (Int => Int), num : Int):Int
}
object higherOrderFuncObj extends App{

  def higherOrdFunction (Value: Int):Int = Value

  val temp: HighOrdFunc = new HighOrdFunc {
    def higherOrderFunction(f: Int => Int, num: Int): Int = f(num)
  }
  val temp2=higherOrderFuncObj
  println(temp2.temp.higherOrderFunction(higherOrderFuncObj.higherOrdFunction,44))

}