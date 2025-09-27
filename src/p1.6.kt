fun main(){
    println("Enter the value of a:")
    var a = readln()!!.toInt()
    println("Enter the value of b:")
    var b = readln()!!.toInt()
    operation(a,b)
}
fun operation(a: Int, b: Int){
    println("Addition of $a, $b  is ${a + b}")
    println("Subtraction of $a, $b is ${a - b}")
    println("Multiplication of $a, $b is ${a * b}")
    if (b != 0) {
        println("Division of $a, $b is ${a.toDouble() / b}")
    } else {
        println("Division: Cannot divide by zero")
    }
}

