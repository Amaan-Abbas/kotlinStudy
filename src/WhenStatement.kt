import java.util.Scanner

fun main() {

    val sc = Scanner(System.`in`)
    print("Enter the name of the animal: ")
    val animal = sc.next()

    val result = when(animal) { //can also be written as "when(val animal = sc.next()) {}"
        "Dog" -> "Dog is an animal"
        "Cat" -> "Cat is an animal"
        "Lion" -> "Lion is an animal"
        "Cow" -> "Cow is an animal"
        else -> "$animal is not an animal"
    }

    println(result)
}