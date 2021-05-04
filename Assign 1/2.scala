object Factorial{
	def main(args: Array[String]) = {
		println( "Enter the number: " )
		val x = scala.io.StdIn.readInt()
		println( "Factorial of " + x + " is " + factorial(x) )
	}

	def factorial(x:Int): BigInt = {
		if (x <= 1)
        	return 1
      	else    
      		return x * factorial(x - 1)
	}
}