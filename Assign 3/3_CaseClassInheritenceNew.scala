/* We use inheritance from case class when we want the parent class to
be immutable. Consider the following example where there is immutable case class currency. 
Class createAccount is derived from this case class. This derived class
can perform operations like receiving currency and Paying out currency. */

case class currency(currencyName:String, country:String)

class createAccount(name: String, Address:String, var currentAmt:Int, currencyName:String, country:String) extends currency(currencyName, country){
	 def receiveCurrency(receiveAmt:Int) = {
	 	currentAmt = currentAmt + receiveAmt
	 	println(s"Amount of $receiveAmt was recieved. Current credit value is $currentAmt")
	 }
	 def payOutCurrency(payOutAmt:Int) {
	 	currentAmt = currentAmt - payOutAmt
	 	println(s"Amount of $payOutAmt was payed out. Current credit value is $currentAmt")
	 }
}

val Ben = new createAccount("Ben", "Tokyo", 1000, "yen", "Japan") 
Ben.receiveCurrency(400)
Ben.payOutCurrency(200)
