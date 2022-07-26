fun main(args: Array<String>) {
    print("Введите количество лайков: ")
    val likes: Int = readLine()!!.toInt()
if (likes % 10 == 1 && likes % 100 != 11) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}
