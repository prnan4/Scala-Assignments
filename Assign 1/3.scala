object Factorial{
	def main(args: Array[String]) = {
		val x = Range(0, 21)
		val res = x.map{factorial(_)}
		for (i <- 0 to 20)
			println(" " + x(i) + "\t" +  res(i) ) 
		
	}

	def factorial(x:Int): BigInt = {
		if (x <= 1)
        	return 1
      	else    
      		return x * factorial(x - 1)
	}
}