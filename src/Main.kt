fun main() {
    val invocar = Operaciones(1.0,2.0)
    val lstop: MutableList<Operaciones> = mutableListOf()

    lstop.add(invocar)


    for (number in lstop) {
        println(number)
    }
}

