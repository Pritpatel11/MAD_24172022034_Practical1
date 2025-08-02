fun main(){
    println("Enter the num1:")
    var a = readLine()!!.toInt()

    println("Enter the num2:")
    var b = readLine()!!.toInt()

    println("Enter the operator:")
    var op = readLine()!!

    var re = cal(a,b,op)
    println(re)

}
fun cal(num1:Int ,num2: Int,operator: String): String
{
    var result = when(operator){
        "+" -> ("Addition of $num1,$num2 is:${num1+num2}").toString()
        "-" -> ("Subtraction of $num1,$num2 is ${num1+num2}").toString()
        "*" ->("multiplication of $num1,$num2 is ${num1+num2}").toString()
        "/" ->("division or $num1,$num2 is ${num1+num2}").toString()
        else -> "You Enter the Wrong thing."
    }
    return result
}