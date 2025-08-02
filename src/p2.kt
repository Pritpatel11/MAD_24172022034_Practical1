fun main(){
//    println("Enter the value of A:")
//    val a= readLine()!!.toInt()
//    println("Enter the value of B:")
//    val b= readLine()!!.toInt()
//
//    println("Enter the any operator")
//    val op=readLine()
//
//    when(op){
//        "+" -> println("${a + b}")
//        "-" -> println("${a - b}")
//        "*" -> println("${a * b}")
//        "/" -> println("${a / b}")
//        else -> println("Invalid operator")
//    }

//    for (i in 0 downTo -100 step 10) {
//        print(i)
//    }
    print("Enter a number: ")
    val num = readLine()!!.toInt()
    var isPrime = true

    if (num <= 1) {
        isPrime = false
    } else {
        for (i in 2..num / 2) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
    }

    if (isPrime) {
        println("$num is a prime number.")
    } else {
        println("$num is not a prime number.")
    }
}
