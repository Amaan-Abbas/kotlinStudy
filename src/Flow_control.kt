//Top-level variable
var name: String? = null

//main() function of the program from where the execution of the program starts.
fun main() {


    //name = "Amaan"
//Using when(case) to control the flow of the println statement.
//    when (name) {
//        null -> println("Hello")
//        else -> println(name)
//    }

    name = "Amaan"
    //using if() to assign a value to the variable.
//    val greeting = if(name != null) name else "Zafir"

    // usng when(case) control flow for assigning a value to the variable.
    val greeting = when(name) {
        null -> "Zafir"
        else -> name
    }
    println(greeting)
}