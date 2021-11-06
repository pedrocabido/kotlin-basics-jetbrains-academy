// write your function here
fun isVowel(l: Char): Boolean {
    return l.uppercaseChar() == 'A' ||
        l.uppercaseChar() == 'E' ||
        l.uppercaseChar() == 'I' ||
        l.uppercaseChar() == 'O' ||
        l.uppercaseChar() == 'U'
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}