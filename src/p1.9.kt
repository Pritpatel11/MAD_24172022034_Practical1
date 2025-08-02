fun main(){
    var arr = arrayOf<Int>(10,2,62,5,50,44)
    var max = arr[0]
    for ((i,e) in arr.withIndex()){
        if (e>=max)
        {
            max=e
        }
    }
    println("max number in Array is $max")
}