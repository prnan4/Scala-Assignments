object StringSplit{

  def matchCase(x:Any):Boolean = x match {
    case str:String  => stringToMap(str)
    case num:Int => println(s"$num: Input cannot be Integer"); false
    case num:Double => println(s"$num: Input cannot be Double"); false
    case ch:Char => println(s"$ch: Input cannot be Character"); false
  }

  def stringToMap(str:String): Boolean = {
    if (str == "") {println("Empty string"); false}
    else {
      val mySeq = str.split(" ").toSeq
      println(s"$str: ${mySeq.groupBy(identity).view.mapValues(_.size).toMap}"); true
    }
  }

  def computeUniqueSubstring(input:Any): Boolean = {
    if(input == ()) { println("Input cannot be empty"); false }
    else matchCase(input)
  }
}
