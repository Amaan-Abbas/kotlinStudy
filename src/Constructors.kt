//Class with a primary constructor
open class Constructors(var name: String) {
    var price: Int = 0

    //Secondary constructor
    constructor(name: String, variable: Int): this(name) {
        this.name = name
        price = variable
    }

    open fun amount() : Int{
        println("The name of the customer is $name")
        return 0
    }

}

class Inheritance(name: String, price: Int) : Constructors(name = name, variable = price) {

    override fun amount() : Int {
        super.amount()

        var sum = 0
        for (i in 1..5) {
            sum += price
        }

        return sum
    }
}

fun main() {
    var amt = 1000
    for (i in 1 .. 5) {
       val obj = Inheritance("Amaan", amt)
        println("The amount paid is ${obj.amount()}")
        amt += 1000
    }
}