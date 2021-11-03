import java.util.Scanner

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)

    val beginRange1 = scanner.nextInt()
    val endRange1 = scanner.nextInt()
    val beginRange2 = scanner.nextInt()
    val endRange2 = scanner.nextInt()
    val input = scanner.nextInt()

    println(input in beginRange1..endRange1 && input in beginRange2..endRange2)
}