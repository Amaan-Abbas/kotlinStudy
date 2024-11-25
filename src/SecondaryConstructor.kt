class SecondaryConstructor(val name: String, val type: String) {
    private var status: String = "Online"

    constructor(name: String, type: String, statusCode: Int): this(name, type) {
        status = when(statusCode) {
            0 -> "Offline"
            1 -> "Online"
            else -> "Undefined"
        }
    }

    //using setter to check and set the value of the sound.
    var soundLevel = 50
        set(value) {
            if (value in 1..100) {
                field = value
            } else {
                println()
                println("The level exceeds the max level!")
                println()
            }
        }

    fun turnOn() {
        println("Tv has been turned on!")
        println("The current status is: $status")
    }

    fun turnOff() {
        println("Tv has been turned off!")
    }
}

fun main() {
    val obj = SecondaryConstructor(name = "Smart Watch", type = "Sports Wearable", statusCode = 1)

    println("The name of the device is ${obj.name}")
    println("${obj.type} is it's category!")
    println("The current volume of the TV is: ${obj.soundLevel}")

    obj.soundLevel = 200

    println("The current volume of the TV is: ${obj.soundLevel}")

    obj.turnOn()
    obj.turnOff()
}