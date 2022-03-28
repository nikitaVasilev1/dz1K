fun main(args: Array<String>) {
    print("Введите количество лайков: ")
    val likes: Int = readLine()!!.toInt()
    if (likes % 10 > 1)
        println("Понравилось $likes людям") else println("Понравилось $likes человеку")
}