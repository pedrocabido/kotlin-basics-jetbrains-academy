package bot

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, $name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders
    val firstRem = scanner.nextLine().toInt()
    val secondRem = scanner.nextLine().toInt()
    val thirdRem = scanner.nextLine().toInt()

    val yourAge = (firstRem * 70 + secondRem * 21 + thirdRem * 15) % 105

    println("Your age is ${yourAge}; that's a good time to start programming!")
}
