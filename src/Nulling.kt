fun main() {
    var name: String? = "Syed Amaan Abbas Naqvi"
    println(name)

    println("The length of the string is: ${name?.length}")

    name = null
    println(name)

    if (name != null) println("Hello") else println("Hi")
}