/* This can be accomplished using the keyword "protected" in case we 
wish to extend the class.
In the example below, we cannot create an object of class A,
whereas we still can create an object of class B that extends A */

protected class A{
	var x:Int = 10
}

class B(val y:Int) extends A{
	override def toString = s"x = $x, y = $y"
}

val b = new B(20)

//If we don't want to extend the class, we can use keyword "private"

private class A{
	var x:Int = 10
}