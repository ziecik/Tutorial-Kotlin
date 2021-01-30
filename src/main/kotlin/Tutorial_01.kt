import com.sun.jdi.IntegerValue

fun main() {
    val name = "kotlin"
    var language : String?= "java"
//    name = "John"
    language = "Wick"
    language = null;
    println("Hello $name! 1 2 ${1 +2}");

    val arr = arrayOf(1, 2, 3)
    println(arr[0])
    val ia : IntArray = intArrayOf(2, 4, 6, 8, 10)
    println("Tell us your age: ")
    val age = Integer.valueOf (readLine())
    val result = if(age >= 18) "You are adult" else "You are just a kid!"
    println(result);

    println("What day is today?")
    val day = readLine()
    val meal = when(day) { // after first match its stop
        "Monday", "Saturday" -> "Chicken"
        "Friday" -> "Salmon"
        "Sunday" -> "Steak"
        else -> "Becon"
    }
    println(meal)

    val food = when {
        day == "Monady" -> "Chicken"
        day == "Friday" && age >= 18 -> "Salmon & Bear"
        else -> "Becon"
    }
    println(food)

    

}