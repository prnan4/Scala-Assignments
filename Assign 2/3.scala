//FOR loop, alternative for break
//use flag instead of break, the control comes out of the loop when i == 5

var abort = false
for (i <- 0 to 10; if (abort == false)){
	println(i)
	if (i == 5) abort = true
}

//WHILE loop, alternative for break

abort = false
var i = 0
while (i <= 10 && abort == false){
	println(i)
	if (i == 5) abort = true
	i +=1
}

//FOR loop, alternative for continue
//This block prints from 0 to 10 skipping 5 alone.

for (i <- 0 to 10){
	var skip = false
	if (i == 5) 
		skip = true
	if (skip == false) println(i)
}

//WHILE loop, alternative for continue

i = 0
while (i <= 10){
	var skip = false
	if (i == 5) 
		skip = true
	if (skip == false) println(i)
	i +=1
}