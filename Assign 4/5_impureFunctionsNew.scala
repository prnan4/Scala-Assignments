/*The function to to check if a number is a palindrome cannot be 
implemented without the use of variables. This is because revNum 
and basePos need constant updation. Using new val object everytime
would consume unwanted memory. 

Thus, we have to use variable whenever there is an updation happening*/

var revNum = 0
var basePos = 1
def reverseNumber(n:Int):Int = {
	if(n > 0) {
	reverseNumber(n / 10)
	revNum  += (n % 10) * basePos
	basePos *= 10
	}	
	revNum
}

def isPalindrome(n:Int) = {
    revNum = reverseNumber(n)
    revNum==n
}

isPalindrome(23432)
