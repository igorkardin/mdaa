fun main(args: Array<String>) {

    val element1 = Book(10, 50000)
    val element2 = Book(1000, 9000)
    val element3 = Book(1000, 9000)
    val element4 = Magazine(300, 500)
    val element5: Book? = null
    val element6 = Book(400, 3455)
    val sum = { x: Int, y: Int -> println(x + y) }

    fun buy(tm: Publication) {
        println("The purchase is complete. The purchase amount was ${tm.price}")
    }

    println(element1.out())
    println(element2.out())
    println(element4.out())

    if (element2 === element3)
        println("Используя сравнение по ссылке объекты оказались Равныы")
    else
        println("Используя сравнение по ссылке объекты оказались NeРавныы")

    if (element2 == element3)
        println("Используя перегруженное сравнение объекты оказались Равныы")
    else
        println("Используя перегруженное сравнение  оказались NeРавныы")


    element6.let{
        buy(it)
    }
    element5?.let{
        buy(it)
    }

    sum(2, 3)
    sum(4, 5)
}
