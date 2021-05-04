object Factorial{

  def matchCase(x:Any, y:Any):Boolean = (x,y) match {
    case (num1: Int, num2:Int )  => printTable(num1,num2)
    case _ => { println(s"Range($x, $y): Range should be in Integer"); false }
  }

  def printTable(x:Int , y:Int ) :Boolean= {
    if( x <= y) {
      val final_res = Range(x,y+1).map{(n:Int) => {
        var res = BigInt(1)
        for (i <- 1 to n)
          res = res * i
        res
      }
      }
      println(s"Input: Range($x, $y)")
      if (x < 0) { println(s"$x \t Factorial not defined for negative integers"); false }
      else {
        if (y > 20) { println(s"$y \t Factorial not defined for numbers > 20"); false }
        else { for (i <- Range(x, y + 1)) println(s"$i \t ${final_res(i - x)}"); true }
        }
      }
      else { println(s"Range($x, $y): Lower limit should be smaller than or equal to the upper limit"); false }
    }

    def findFactorialTable(x:Any, y:Any):Boolean = {
      if(x == () || y == ()) { println("Input cannot be empty"); false }
      else matchCase(x,y)
    }
  }
