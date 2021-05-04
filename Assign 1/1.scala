object HelloWorld{
	def main(args: Array[String]) = {
		if( args.length != 0 ) 
			println("Hello " + args(0) + ", Welcome to the world of Scala." )
	}
}