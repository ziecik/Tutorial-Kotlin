package oop

class Student(school: String) : AbstractPerson(), PersonActions{
    override val id = firstName + lastName + school + age
    override fun wearCloths() {
        println("Student wears uniforms")
    }

}