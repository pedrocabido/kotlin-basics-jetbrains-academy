fun main() {
    // put your code here
    var perfect: Int = 0
    var larger: Int = 0
    var rejections: Int = 0
    val totalParts = readLine()!!.toInt()

    repeat(totalParts) {
        val detector = readLine()!!.toInt()
        if (detector == 0) {
            ++perfect
        } else if (detector > 0) {
            ++larger
        } else {
            ++rejections
        }
    }
    println("$perfect $larger $rejections")
}