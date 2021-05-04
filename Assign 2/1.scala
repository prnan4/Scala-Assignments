/* 
yield can be used when there are two containers nad we want to iterate through 
both simultaneously and derive a result. Whereas map cannot be used for this purpose.

Consider the following example where there are two vectors i, j and we want the product
of all possible combinations of their tuples.
*/

val i = 1 to 3
val j = 4 to 6
for(x<- i; y <-j) yield (x*y)

/*
Result: Vector(4, 5, 6, 8, 10, 12, 12, 15, 18)
This cannot be done using map.

Whereas is we want the product of only the tuples (0,0), (1,1) ...(k,k), we need to use map.
*/

val m = 1 to 3
val n = 4 to 6
m.zip(n).map(p=>p._1*p._2)

/*
Result: Vector(4, 10, 18)
This cannot be done using yield construct.
*/