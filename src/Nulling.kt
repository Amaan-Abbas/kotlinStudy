fun main() {
    var name: String? = "Syed Amaan Abbas Naqvi"
    println(name)

    println("The length of the string is: ${name?.length}")

    name = null
    println(name)

    if (name != null) println("Hello") else println("Hi")

    //println("The length of the the string is: ${name!!.length}") // the reference is to that length function returns the length of the string while asserting th value of the string is nor null even if it is actually  null.
}