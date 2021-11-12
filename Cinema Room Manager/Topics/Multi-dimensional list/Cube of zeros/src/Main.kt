fun main() {
    // write your code here
    val mdList: MutableList<MutableList<MutableList<Int>>> = mutableListOf()
    for (i in 0..2) {
        mdList.add(mutableListOf())
        for (j in 0..2) {
            mdList[i].add(mutableListOf(0, 0, 0))
        }
    }
    print(mdList)
}