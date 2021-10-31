fun main() {
    // put your code here
    var natural: Int = readLine()!!.toInt()
    while (natural != 1) {
        print("$natural ")
        if (natural % 2 == 0) natural /= 2 else natural = natural * 3 + 1
    }
    print(natural)
}