object HelloWorld {
  def matchCase(args: Array[Any]):Boolean = args(0) match{
    case text:String => printHello(text)
    case num:Int => { println(s"$num: Input cannot be integer"); false }
    case num:Double => { println(s"$num: Input cannot be Double"); false }
    case ch:Char => { println(s"$ch: Input cannot be character/symbol"); false }
    case _ => { println("Input should be String"); false }
  }

  def printHello(name:String):Boolean = {
    if (name != "") { println("Hello " + name + ", Welcome to the world of Scala."); true}
    else  { println("No name found"); false}
  }

  def acceptName(args: Array[Any]):Boolean = {
    if(args.length == 0) { println("No Arguments found"); false}
    else matchCase(args)
  }
  def main(args: Array[String]) = {
  }

}
