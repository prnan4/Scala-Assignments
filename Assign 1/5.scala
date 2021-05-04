object StringSplit{
	def main(args: Array[String]) = {
		println( "Enter the string: " )
		val str = scala.io.StdIn.readLine()
		print(Compute_unique_substring(str))
		
	}

	def Compute_unique_substring(str:String): Map[String, Int] = {
		val arr = str.split(" ")
		val mySeq = arr.toSeq
		val resMap = mySeq.groupBy(identity).view.mapValues(_.size).toMap
		return resMap
	}
}