fun main (){
    var coding=("codeHive")
    var result=coding[4].toString()+coding[5]+coding[6]+coding[7]
    println(result)
   var modulus= division(23,14)
println(modulus)
    var sentence=name("joy",34)
    println(sentence)


}
fun division(h: Int, d: Int):Int{
    var modulus=h%d
    return modulus


}
fun name(name: String,age: Int):String{
    var sentence=("Hi my name is $name and i am $age years old")
    return sentence
}










