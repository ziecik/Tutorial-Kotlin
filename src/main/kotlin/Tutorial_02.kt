fun main() {
    val ia = intArrayOf(2, 4, 6, 8, 10)
    val list = listOf<String>("Kotlin", "Java", "JS", "PHP")
    val map = mapOf(1 to "Kotlin", 2 to "Java", 3 to "JS", 4 to "PHP")

    for(a in ia) {
        println(a)
    }

    for(str in list)
        println(str)

    for((key, value) in map) {
        println("$key => $value")
    }

    for(i in 1..9)
        print(i)
    println()
    for (i in 1 until 9 step 2)
        print(i)
    println()
    for(i in 9 downTo 1 step 2)
        print(i)

    
}