class BackingField {
    var name: Int = 15
        set(value) {
            if (value in 1..100) {
                field = value
            }
        }

    fun printing() {
        println("The name of the person is: $name")
    }
}

fun main() {
    val backingFieldObj = BackingField()
    backingFieldObj.printing()

    backingFieldObj.name = 87
    backingFieldObj.printing()
}