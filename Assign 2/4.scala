Iclass Product
val pencil = new Product

def isPrime(x:Int):Boolean = {
	var return_val = true
	for(i <- 2 until x/2) if(x % i == 0) return_val = false
	return_val
}

def isPalindrome(str:String):Boolean = {
		var return_val = true
        var i = 0; var j = str.size - 1; 
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) return_val = false 
            i = i +1; j = j -1; 
        } 
        return_val
    } 

def match_mixed_type(i:Any) = i match {
	case 8 => "exact number"
	case num_prime:Int if isPrime(num_prime) => "prime number"
	case num:Int if (24 < num && num <29) => "numeric range"
	case "hey" =>"exact string"
	case class_type:Product => "Class type"
	case text_palindrome:String if isPalindrome(text_palindrome)=> "palindrome string"
	case text_hello:String if text_hello.contains("hello") => "string contains hello"
	case text:String if text.size > 5 => "strings of length>5"
	case _ => "default"
}

//Unit tests
println(match_mixed_type(8))
println(match_mixed_type(7))
println(match_mixed_type(26))
println(match_mixed_type("hey"))
println(match_mixed_type(pencil))
println(match_mixed_type("abba"))
println(match_mixed_type("This text contains hello"))
println(match_mixed_type("This is a text of size >5"))