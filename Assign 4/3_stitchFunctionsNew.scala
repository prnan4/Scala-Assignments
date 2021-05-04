def square(n:Int) = n*n
def add5(n:Int) = n+5
def mul10(n:Int) = n*10
def double(n:Int) = n+n
def triple(n:Int) = n*3

//To stitch these functions into one long function, we can use the compose function.

def compose(n:Int) = triple(double(mul10(add5(square(n)))))

//We can call this compose function and pass an Integer argumnet to it as follows:

println(compose(2))

//When doing so, the output of the previous function will be passed as the input to the next function 

//To stitch the function by invoking the function ftrom a previous function definition:

def Stitch(n:Int) = Add5(n*n)
def Add5(n:Int) = Mul10(n+5)
def Mul10(n:Int) = Double(n*10)
def Double(n:Int) = Triple(n+n)
def Triple(n:Int) = n*3

println(Stitch(2))