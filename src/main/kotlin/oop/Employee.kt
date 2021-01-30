package oop

class Employee(company: String) : Person(), PersonActions {
    override val id = firstName + lastName + company + age
    override fun wearCloths() {
        println("Employee wears suit.")
    }

}