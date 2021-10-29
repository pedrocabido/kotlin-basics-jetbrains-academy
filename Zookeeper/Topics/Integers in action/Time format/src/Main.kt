fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    // enter your code
    println("${totalSeconds / 60 / 60 % 24}:${totalSeconds / 60 % 60}:${totalSeconds % 60}")
}