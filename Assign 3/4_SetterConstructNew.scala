/* In scala naming conventions, although underscores (_) are allowed to be a part of 
function name/ property name, it has a special meaning. When the name of a method is 
the name of the property followed by "_=", the compiler reads it as a mutator. 

When the accessor with a particular property name is defined using the setter construct,
a call-site mutation syntax is enabled which mirrors assignment. 

In the given example, the propert age is followed with "_=". This causes the compiler
to enable the method as a mutator. */


class person(val name:String, var _age:Int){
    def age = _age
    def age_=(x:Int):Unit =if(x>_age) _age = x
    }

val Ben = new person("Ben",18)
Ben.age = 19