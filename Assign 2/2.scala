/*
A: do { println(x); x+=1 } while(x <10)
B: while(x<10) { println(x); x+=1}
The above two code snippets yield the same result.  

In "while loop", the condition appears at the beginning. It is used when we
don't know the number of times a loop should execute.
Whereas do-while is exit controlled loop. The contents of the loop will
execute at least once in this case.

Example for a program that can be done efficiently using "do-while" 
and not using while: 

*/

var edge_lengths = Array.empty[Int]
var x = 0
do{
	println( "Enter input: " )
	x = scala.io.StdIn.readInt()
	edge_lengths = edge_lengths :+ x //to append to array
	print("Edges:")
	for( i <- 0 until edge_lengths.size) print(s"  ${edge_lengths(i)}")
	println("")
}while(x != -1)

/*
Consider the example where user inputs the edge lengths of a polygon. User
uses "-1" to terminate his input. For example, input of the user for a 4 sided polygon
would be the array (2, 4, 5, 6, -1).

If the program, was to be written using "while" loop, it would be:

var edge_lengths = Array()
var x = 0
println( "Enter input: " )
x = scala.io.StdIn.readInt()
edge_lengths = edge_lengths :+ x //to append to array
print("Edges:")
for( i <- 0 until edge_lengths.size) print(s"  ${edge_lengths(i)}")
println("")
do{
	println( "Enter input: " )
	x = scala.io.StdIn.readInt()
	edge_lengths = edge_lengths :+ x //to append to array
	print("Edges:")
	for( i <- 0 until edge_lengths.size) print(s"  ${edge_lengths(i)}")
	println("")
}while(x != -1)

Here, as we can see several lines of code are repeated and thus is not efficient. 

Example for a program that can be done efficiently using "while" 
and not using "do-while": 
*/

println( "Enter balance: " )
var balance = scala.io.StdIn.readInt()
var count = 1
while (balance <10)
{
	balance +=1
	println(s"Balance after iteration $count is Rs. $balance")
	count +=1
}

/*In the above code, if the user enters a balance <10, balance is incremented by 1
at each step. If user enters balance >10, balance should not be incremented. However, 
using "do-while" executes the loop statement without checking the condition. Thus it is 
not preferred"*/


