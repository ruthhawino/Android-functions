fun main(){
    name("Ruth")
    var remainder=modulus(num1 = 24, num2 = 7)
    println(remainder)
    facts()



}
fun name(name:String){
    println("Hello" + " " +name)

}
fun modulus(num1:Int,num2:Int):Int {
    var remainder = num1 % num2
    return remainder

}

fun facts(){
    var fact ="I am intelligent"
    println(fact)

}
