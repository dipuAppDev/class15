fun main(args: Array<String>) {
    /*obj create for Lamp class*/var l1 = Lamp()//-> constructor called for creating obj for Lamp class
    l1.turnOn() // turnOn function called using Lamp class obj and dot notaion
    l1.display() // turnOff function called using Lamp class obj and dot notaion

    var p = Person("Rakib",24) // create obj for Person class
    println("My name is ${p.firstName}") // access property of Person class using Person class obj and dot notation
    println("My age is ${p.age}")
    //Info class call and print its value
    var info = Info() // default constructor
    println(info.firstName)
    println(info.age)
    //secondary constructor
    var seconConst = SecondaryConst()
    println(seconConst.fName)
    println("${seconConst.ag}")
}