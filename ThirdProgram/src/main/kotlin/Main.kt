fun main(args: Array<String>) {
    print("Предыдущая сумма покупка: ")
    val previousAmount = readLine()!!.toInt()
    print("Текущая сумма покупки: ")
    val currentAmount = readLine()!!.toInt()
    print("Вы постоянный клиент? ")
    val constantUser = readLine()!!.toString()
    if (constantUser == "да") {
        if (previousAmount <= 1000) println("Сумма к оплате ${currentAmount * 0.99} руб.") else
            if (previousAmount > 1000 && previousAmount <= 10000) println("Сумма к оплате ${(currentAmount - 100) * 0.99} руб.") else
                println("Сумма к оплате ${(currentAmount * 0.95) * 0.99} руб.")
    } else {
        if (previousAmount <= 1000) println("Сумма к оплате $currentAmount руб.") else
            if (previousAmount > 1000 && previousAmount <= 10000) println("Сумма к оплате ${currentAmount - 100} руб.") else
                println("Сумма к оплате ${currentAmount * 0.95} руб.")
    }
}