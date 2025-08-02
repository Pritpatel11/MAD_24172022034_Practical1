fun main() {
    val intValue: Int = 10
    val doubleValue: Double = intValue.toDouble()

    println("Integer Value:$intValue")
    println("Double Value (From Integer):$doubleValue")

    val strValue: String = "10"
    println("String Value:$strValue")

    val intValue1: Int = strValue.toInt()
    println("Integer Value1 (From String):$intValue1")

    val intValue2: Int = "10".toInt()
    println("Integer Value2 (From String):$intValue2")

    val strDouble: String = "11.12"
    val doubleFromString: Double = strDouble.toDouble()
    println("Double Value (From String):$doubleFromString")
}
