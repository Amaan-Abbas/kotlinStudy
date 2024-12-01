package OOPs

open class ParentClass(val Name: String, val Category: String) {

    fun Print() {
        println("The name of the device is $Name and the category is $Category.")
    }

}

//if the name of the parameters of the child class are the same as parent class irrespective of the case then there will be an error thrown, to fix the error either use different variable names or make the variables private.
class InheritanceInKotlin(name: String, category: String) : ParentClass(name, category){
         var setVolume = 2
            set(value) {
                if(value in 1..100) {
                    field = value
                }
            }

    fun Return() {
        println("The volume of the device $Name is $setVolume")
    }
}

fun main() {
    val obj = InheritanceInKotlin("Amaan", "Tv")
    obj.Print()
    obj.Return()
}