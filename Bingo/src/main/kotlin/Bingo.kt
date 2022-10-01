var alreadyDrawn = arrayListOf(
    1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 15,
    16, 19, 22, 23, 24, 25, 26, 28,
    31, 33, 35, 36, 38, 39, 42, 43, 45,
    46, 47, 48, 49, 50, 52, 53, 54, 55, 56, 57, 58, 59,
    63, 64, 65, 68, 69, 70, 73, 74, 75)

const val sleepTime = 4_000L

fun main(args: Array<String>) {

    println("I would like to extend a heartfelt welcome to you all!")

    Thread.sleep(sleepTime)
    println("Bingo number #1 of the day is:" + drawBingoNumber(alreadyDrawn))

    Thread.sleep(sleepTime)
    println("Bingo number #2 of the day is:" + drawBingoNumber(alreadyDrawn))

    Thread.sleep(sleepTime)
    println("Bingo number #3 of the day is:" + drawBingoNumber(alreadyDrawn))

}

fun checkAlreadyDrawn(drawnNumber: Int): Boolean {
    return alreadyDrawn.contains(drawnNumber);
}

fun drawBingoNumber(alreadyDrawn: ArrayList<Int>): Int {
    val drawnNumber = getRandom()

    return if (!checkAlreadyDrawn(drawnNumber)){
        alreadyDrawn.add(drawnNumber)
        drawnNumber
    } else {
        drawBingoNumber(alreadyDrawn)
    }
}

fun getRandom(): Int{
   return (0..75).random()
}
