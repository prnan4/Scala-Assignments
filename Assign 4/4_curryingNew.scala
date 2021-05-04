/* Consider the use case of opening a bank account. Deatils like Name, address and aadhar 
number and initialDeposit are mandatory. In case the user wants to add a nominee in the future,
he can specify the details seperately. This is called partial application. This can be done using
parametrized constructor as well as currying. */

/* Both are similar, in the sense they let us use methods in a partial way. We can pass some
arguments initially, and some later.
However, OO Paradigm lets us have more than one definition within a given class. This cannot be done in 
currying as the outer function can return only one function that can be called later.
Lets see how to do this using parametrized constructor*/

class createAccount(name:String, address:String, aadhar:BigInt, initialDeposit:Int) {
    val currentAmount = initialDeposit + 0.2*initialDeposit
    override def toString = s"The account has $currentAmount credit."
    def electNominee(nomineeRelation:String, nomineeName:String) = {
        println(s"$nomineeName , $nomineeRelation of $name has been elected as the nominee for the account.")
    }
}

val priyaAccount = new createAccount("Priya", "Chennai", 228724449, 2000)
priyaAccount.electNominee("Daughter", "Riya")

//The same example can be demonstarted using currying.

def createAccount(name:String, address:String, aadhar:BigInt, initialDeposit:Int) = {
    val currentAmount = initialDeposit + 0.2*initialDeposit
    println(s"The account has $currentAmount credit.")
    (nomineeRelation:String, nomineeName:String) => { 
        println(s"$nomineeName , $nomineeRelation of $name has been elected as the nominee for the account.")
    }
}

//For creating the account, we first provide the mandatory details. Function 
//nominee election is returned as a result.
val nomineeElection = createAccount("Priya", "Chennai", 228724449, 2000)
nomineeElection("Daughter", "Riya")

