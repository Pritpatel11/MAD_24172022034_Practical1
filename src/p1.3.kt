fun main(){
    println("enter the Enrollment no:");
    var en = readLine() ?: ""

    println("Enter the Student name:");
    var name = readLine() ?: ""

    println("Enter the Student Branch:");
    var branch = readLine() ?: ""

    println("Enter the Class:")
    var sclass  =readLine() ?: ""

    println("Enter Studnet Batch:")
    var bathch = readLine() ?: ""

    println("Enter the Studnet Colage name:")
    var clg = readLine() ?: ""

    println("Enter University name:")
    var uni = readLine() ?: ""

    println("Enter the Age of the Studnet:");
    var age = readLine() ?: ""

    println("************************")

    println("Studnet's data")
    println("Enrollment no:$en")

    println("name:$name")
    println("Age:$age")
    println("Branch:$branch")
    println("Class:$sclass")
    println("Batch:$bathch")
    println("Collage Name:$clg")
    println("university Name:$uni")
}