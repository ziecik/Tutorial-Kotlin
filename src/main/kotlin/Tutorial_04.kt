import oop.Employee
import oop.Person
import oop.Student

fun main() {
    val p1 = Person()
    p1.age = 33
    println("My name is ${p1.firstName} ${p1.lastName} (${p1.age}yrs) @${p1.id}")
    val p2 = Person("Franz", "Maurer", 42)
    println("My name is ${p2.fullName} (${p2.age}yrs) @${p2.id}")
    val p3 = Person(year = 10)  // -> 38 + 10
    println("My name is ${p3.fullName} (${p3.age}yrs) @${p3.id}")

    val e1 = Employee("ABCD")
    println("Employee e1 ID: ${e1.id}")
    e1.wearCloths();

    val s1 = Student("MIT")
    println("Student s1 ID: ${s1.id}")
    s1.wearCloths();
}