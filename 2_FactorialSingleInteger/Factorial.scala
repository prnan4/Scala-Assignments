object Factorial{

  def caseMatch(x:Any):BigInt = x match {
    case num: Int    => {
      val res = compute(num)
      if (res != -1) println(s"$x: Factorial is $res"); res
    }
    case num:Double => { println(s"$x: Input cannot be double value."); -1 }
    case ch:Char => { println(s"$x: Input cannot be a character."); -1 }
    case str:String => { println(s"$x: Input cannot be String."); -1 }
    case _ => { println(s"$x: Input should strict be an integer."); -1 }
  }

  def compute(x:Int): BigInt = {
    if ( x>= 0 && x<=20){
      if (x <= 1) 1
      else x * compute(x - 1)
    }
    else { println(s"$x: Input should lie between the Range 0,20."); -1 }
  }

  def findFactorial(x:Any):BigInt = {
    if (x == ()) { println(s"$x: Input cannot be empty"); -1 }
    else caseMatch(x)
  }
}
