fun main (){
names("Joy","Jane","Japh","John")
cities(arrayOf("harare","mumbai","dodoma","jakarta"))
numbers()
    names()
}
//create a function that takes in 4 strings and creates an array out of them then
//prints out array

fun names(a:String,b:String,c:String,d:String){
    var name=arrayOf(a,b,c,d)
    println(name.contentToString())
}
//create a function that given an array var cities=arrayOf("harare","mumbai","dodoma","jakarta")
//prints out the name of the cities in the correct grammatical case

fun cities(cit:Array<String>) {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    for (f in cities)
        println(f.capitalize())
}
fun numbers(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=(numbers[1]+numbers[2])
    println(sum)
    println(numbers[12])
    println(numbers.sortedArray().contentToString())
    }
fun names(){
    var names= arrayOf("Joy","Chris","Dean","Jero")
    println(names)
}





