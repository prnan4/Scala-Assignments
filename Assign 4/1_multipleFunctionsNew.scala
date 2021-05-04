object multipleFunctions{

	def main(args: Array[String]):Unit = {
		//accept input from command line in the form of 'n ch'
		val n:Int = args(0).toInt
		val ch:Char = args(1)(0)
		println(mapFn(ch)(n))
	}
	val mapFn = Map('A' -> isPrime _, 'B' ->isSquare _, 'C' -> isIrrational _, 'D' -> isFibonacci _, 
					'E' -> logGreaterThan _, 'F' -> factorialLessThan _, 'G'-> isPerfect _ )


	def isPrime(n: Int) = ! Range(2, n-1).exists(n % _ == 0)

	def isSquare(n: Int) = Math.sqrt(n) - Math.floor(Math.sqrt(n)) == 0

	def isIrrational(n: Int) = Math.floor(n) - n != 0	

	def isFibonacci(n: Int) = isSquare(5 * n * n - 4) || isSquare(5 * n * n + 4)

	def recursiveLog(n: Double):Double = {
		if (n >1.0) 1.0 + recursiveLog(Math.log(n))
		else 0
	}

	def logGreaterThan(n: Int)= recursiveLog(n.toDouble) >3.0 	//Iterated log to the base e

	def factorialLessThan(n: Int)= { 
		var fact:Double = 1
		for(i <- 1 to n) fact=fact*i
		fact < Math.pow(2,20) 
	}

	def isPerfect(n: Int)= {
		var sum = 0
		for(i <- 1 to n-1) {if (n%i == 0) sum=sum + i}
		sum == n
	}

}