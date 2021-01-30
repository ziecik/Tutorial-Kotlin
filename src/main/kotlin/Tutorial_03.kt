fun main() {
    // extension function for a String class
    fun String.getEmotion(): String{
        return when {
            last() == '!' -> "Exciting"
            last() == '?' -> "Curious"
            last() == '.' -> "Calm"
            else -> "Unknown"
        }
    }

    val s = "How are you";
    println(s.getEmotion())
}