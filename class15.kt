//class Lamp { // create Lamp class
//    private var isOn = false // create isOn variable using private access modifier
//    fun turnOn(){ // create turnOn function in Lamp class
//        isOn = true
//    }
//    fun turnOff(){ // create turnOff function in Lamp class
//        isOn = false
//    }
//    fun display(){ // create display function in Lamp class for display result
//        println(isOn)
//    }
//}
//class Person( // create Person class
//    var firstName:String,
//    var age:Int
//)
//
//fun main(args: Array<String>) {
//    /*obj create for Lamp class*/var l1 = Lamp()//-> constructor called for creating obj for Lamp class
//    l1.turnOn() // turnOn function called using Lamp class obj and dot notaion
//    l1.display() // turnOff function called using Lamp class obj and dot notaion
//
//    var p = Person("Rakib",24) // create obj for Person class
//    println("My name is ${p.firstName}") // access property of Person class using Person class obj and dot notation
//    println("My age is ${p.age}")
//}
class Lamp { // create Lamp class
    private var isOn = false // create isOn variable using private access modifier
    fun turnOn(){ // create turnOn function in Lamp class
        isOn = true
    }
    fun turnOff(){ // create turnOff function in Lamp class
        isOn = false
    }
    fun display(){ // create display function in Lamp class for display result
        println(isOn)
    }
}
class Person( // create Person class
    var firstName:String,
    var age:Int
)

class Info ( // primary constructor
    var firstName:String="Unknown",
    var age:Int = 18
) // default parameter value set
//secondary const
class SecondaryConst{
    var fName: String=""
    var ag:Int = 0
    constructor( fName: String,ag: Int){
        this.fName = fName
        this.ag = ag
    }
    constructor()
    constructor(fName: String){
        this.fName = fName
    }


}