import java.util.Scanner

fun main() {
//    val isTrafficLightRed = true
//
//    if(isTrafficLightRed) {
//        println("Stop!")
//    } else {
//        println("Be ready to stop!")
//    }

//    println(1 > 1)

//    val trafficLightColor = "Green"
//
//    if (trafficLightColor == "Red") {
//        println("Stop")
//    } else if (trafficLightColor == "Yellow") {
//        println("Slow down")
//    } else if (trafficLightColor == "Green") {
//        println("Go")
//    } else {
//        println("Traffic Light invalid color!")
//    }
    val sc = Scanner(System.`in`)
//
//    print("Enter the color of the traffic light: ")
//    val trafficLightColor = sc.next()
//
//    when (trafficLightColor) {
//        "Red" -> println("stop")
//        "Yellow" -> println("Slow down")
//        "Green" -> println("Go")
//        else -> println("Traffic light invalid color, caution!") //This line of code is used in when() as a replacement to else statement in if-else statements.
//    }

//    val a = 5
//    val b = 10
//    val hello = if(a < b) a else b + 1 //if-else expressions are used to assign values to a variable using conditionals i.e. assigning values to the variables under certain conditions.
//    print(hello)

//    val a = 5
//    val b = 10
//    val hello: Int = when {
//        a > b -> a
//        b > a -> b
//        else -> 0
//    } //if-else expressions are used to assign values to a variable using conditionals i.e. assigning values to the variables under certain conditions.
//    print(hello)


//    val number = sc.nextInt()
//    when (number) {
//        2, 3, 5, 7 -> println("It is a prime number!")
//        else -> println("Thw number is greater than 9")
//    }

//    val number = sc.nextInt()
//    when (number) {
//        2, 3, 5, 7 -> println("It is a prime number!")
//        in 1..9 -> println("It is a number between 1 to 9, it is not a prime number!")
//        is Int -> println("It is a number") //is is used to check whether the inputted value is of specific type or not, in this given case it is checking whether the given type is Integer or not.
//    }

    val message = when (val trafficLightColor = "Amber") {
        "Red" -> "Red"
        "Yellow", "Amber" -> trafficLightColor
        "Green" -> "Green"
        else -> "Invalid traffic light color, CAUTION!"
    }

    println(message)
}