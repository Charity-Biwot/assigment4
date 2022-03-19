fun main(){
    var x = ArrayOfintergers(arrayOf(4*5*4))
    println(x)
    var y=ArrayOfmixed(arrayOf(2.3,4.0F,4.0,'B',4.7, "Joy"))
    println(y)
    var z = ArrayOfChar(arrayOf('a','b','c','e','i','o','u','f'))
    println(z)
}
//write a function that takes in an array of intergers and returns the product of all the elements

fun ArrayOfintergers(numbers:Array<Int>): Int{
    var product = 1
    numbers.forEach { num->
        if(num is Int){
            product*=num }
    }
   return product
}
//Write a function that  takes an array of mixed types and returns the sum of all the decimal elements
fun ArrayOfmixed(mixedtypes:Array<Any>):Double{
    var sum =0.0
    mixedtypes.forEach { num->
        if(num is Double){
            sum+=num
        }
    }
   return sum
}
//write a function that takes in an array of characters and returns the number of vowels in the array
fun ArrayOfChar(Characters:Array<Char>):Int{
    var addition=0
    Characters.forEach{vowels->
     if(vowels=='a'|| vowels=='e'||vowels=='i'||vowels=='o'||vowels=='u')
         ++addition

    }
    return addition
}




































