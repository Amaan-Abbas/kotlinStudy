class SmartDevices(val name: String, val category: String) {
    /*
    Since the name and category of the device are
     */
//    val name = "Android Tv"
//    val category = "Entertainment"
    var deviceStatus = "Online"

    var volumeLevel: Int = 15
        set(value) {
            if (value in 0..100) {
                field = value
            } else {
                println("Volume out of range! Can't set more than 100")
            }
        }

    fun turnOn() {
        println("Tv has been turned on!")
    }

    fun turnOff() {
        println("Tv has been turned off!")
    }
}

fun main() {
    val obj = SmartDevices("Android Tv", "Sports")

    println("The name of the device is ${obj.name}")
    println("${obj.category} is it's category and ${obj.deviceStatus} is it's current status!")
    println("The current volume of the TV is: ${obj.volumeLevel}")

    obj.volumeLevel = 200

    println("The current volume of the TV is: ${obj.volumeLevel}")

    obj.turnOn()
    obj.turnOff()
}