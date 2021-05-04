object Factorial{
	def main(args: Array[String]) = {
		val x = Range(0, 21)
		val res = x.map{(n:Int) => {
			
				var res = BigInt(1)
				for (i <- 1 to n)
					res = res * i
      			res
			}
		}
		for (i <- 0 to 20)
			println(" " + x(i) + "\t" +  res(i) ) 
	}
}