val text = """This is 			

the



longest text that

we use"""

//We replace the extra spaces, tab spaces and new lines with " "
val new_text = text.trim.replaceAll("\n", " ").trim.replaceAll("\t", " ").trim.replaceAll(" +", " ")
var arr = new_text.split(" ")

//We use insertion sort to sort the array of strings in descending order
for (i <- 1 until arr.size) 
    { 
        var temp = arr(i); 
        var j = i - 1; 
        while (j >= 0 && temp.length() > arr(j).length()) 
        { 
            arr(j+1) = arr(j); 
            j = j -1; 
        } 
        arr(j+1) = temp; 
    } 
