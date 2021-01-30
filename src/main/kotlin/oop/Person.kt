package oop

// contructor can be omitted when there is no methods inside
// default constructor value:
// class is final by default. To enable inheritance the keyword 'open' is required
// open means overrideable
// if class is abstract it's open too
open class Person constructor(var firstName: String = "John", var lastName : String = "Wick", var age : Int = 38){

        val fullName: String
            get() = "$firstName $lastName"

    constructor(year: Int) : this() {
        age += year
    }

    open val id : String
    init {  //  praimary constructor
        id = firstName + lastName + age
    }


//      Java way:
//    var firstName : String = "John"
//    var lastName : String = "Wick"
//    var age : Int = 38
}