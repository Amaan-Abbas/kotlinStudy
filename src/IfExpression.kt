fun main() {
    val number = 10

//    val resultExpression = if (number % 2 == 0) {
//        "$number is an even number!"
//    }
//    else {
//        "$number is an odd number!"
//    }


    val resultExpression = if (number % 2 == 0) "$number is an even number!" else "$number is an odd number!"
    println(resultExpression)
}