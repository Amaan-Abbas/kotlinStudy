package OOPs


open class Parentclass(val name: String, val type: String) {

    fun result() {
        println("Hello My name is $name")
    }

    var typing = "$type hello!"

    fun returning() {
        println("the new typing is $typing")
    }

    open fun turnOn() {
        println("The $name has been turned on!")
    }

    open fun turnoOff() {
        println("The $name has been turned off!")
    }
}
class InheritanceMany(name: String, type: String) : Parentclass(name, type) {

    var volumeLevel = 1
        set(value) {
            if (value in 1..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 1..200) {
                field = value
            }
        }

    fun changeChannel() {
        channelNumber++
        println("Channel has been changed, current channel: $channelNumber")
    }

    fun volumeIncrease() {
        volumeLevel++
        println("Volume level has been increased, the current volume is: $volumeLevel")
    }

    fun volumeDecrese() {
        volumeLevel--
        println("Volume level has been decreased, the current volume is: $volumeLevel")
    }

    override fun turnOn() {
        println("The $name has been turned on")
    }

    override fun turnoOff() {
        println("The $name has been turned off!")
    }
}

class Childclass(name: String, type: String) : Parentclass(name, type) {
    fun Print() {
        println("My name is Syed Amaan Abbas Naqvi!")
    }
}

class CallingClass(val obj1: InheritanceMany = InheritanceMany("Amaan", "Person"), val obj2: Childclass = Childclass("Abbas", "Mola")) {
    fun turningOn() {
        obj1.turnOn()
    }

    fun volDec() {
        obj1.volumeDecrese()
    }

    fun Printing() {
        obj2.Print()
    }

    fun Name() {
        obj1.result()
    }
}

fun main() {
    val obj: CallingClass = CallingClass()

    obj.turningOn()
    obj.volDec()
    obj.Printing()
    obj.Name()
}

