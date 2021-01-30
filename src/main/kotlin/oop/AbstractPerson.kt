package oop

// contructor can be omitted when there is no methods inside
// default constructor value:
// class is final by default. To enable inheritance the keyword 'open' is required
// open means overrideable
// if class is abstract it's open too
abstract class AbstractPerson constructor(var firstName: String = "John", var lastName : String = "Wick", var age : Int = 38){

        val fullName: String
            get() = "$firstName $lastName"

    constructor(year: Int) : this() {
        age += year
    }

    abstract val id : String



//      Java way:
//    var firstName : String = "John"
//    var lastName : String = "Wick"
//    var age : Int = 38
}