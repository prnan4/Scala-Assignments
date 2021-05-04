def createFunction(operator:Char) = { 

	def add(X:(Int,Int), Y:(Int,Int)) = (X._1 + Y._1, X._2 + Y._2)
	
	def sub(X:(Int,Int), Y:(Int,Int)) = (X._1 - Y._1, X._2 - Y._2)

	def mul(X:(Int,Int), Y:(Int,Int)) = ((X._1 * Y._1) - (X._2 * Y._2 ), (X._1 * Y._2) + (X._2 * Y._1))

	def div(X:(Int,Int), Y:(Int,Int))= {
		val denominator:Double = (Y._1 * Y._1) + (Y._2 * Y._2)
		val reciprocalY:(Double,Double) = (Y._1 / denominator, - Y._2 /denominator)
		((X._1 * reciprocalY._1) - (X._2 * reciprocalY._2 ), (X._1 * reciprocalY._2) + (X._2 * reciprocalY._1))
	}
	 operator match {
		case '+' => add _
		case '-' => sub _
		case '*' => mul _
		case '/' => div _
	}
}
//making calls to the nested function and printing the result

println( createFunction('+')((2,3),(1,4)) )
println( createFunction('-')((2,6),(3,4)) )
println( createFunction('*')((1,4),(5,1)) )
println( createFunction('/')((7,-6),(2,-3)) )
