fun main() {
//    var member = "Sarah Oh" //When there is no value to be assigned to a variable then we can use "null" to assign an empty(?) value to the variable.
//    println(member)
//
//    member = "Meryl SHeep"
//    println(member)

//    //No favourite actor as of now
//    var favouriteActor: String? = "Sarah Oh"
//    println(favouriteActor)
//
//    favouriteActor = null
//    println(favouriteActor)
//
//    //using Int?  and reassigning it to null
//    var number: Int? = 5
//    println(number)
//
//    number = null
//    println(number)

    //Handling the nullable variables
    var favoriteActor: String? = null
    println(favoriteActor?.length) //Safe check operator "?." is used to call the methods or functions of nullable variables.
}