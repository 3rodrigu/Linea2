class Operaciones(var n1:Double, var n2:Double) {
    fun Suma() { //Fucion sin parametros ni retorno
        val suma = n1 + n2
        println("la suma es $suma")
    }
    fun Resta() { //Fucion sin parametros ni retorno
        val resta = n1 - n2
        println("la resta es $resta")
    }
    fun Divicion():Double { //Fucion sin parametros y con retorno
        val divicion = n1 / n2
        return (divicion)
    }
    fun Raiz(n1:Double) { //Fucion con parametros y sin retorno
        val raiz = Math.sqrt(n1)
        println("la raiz cuadrada es $raiz")
    }
    fun Cuadrado(n1:Double):Double { //Fucion con parametros y con retorno
        val cuadrado = Math.pow(n1,2.0)
        return  (cuadrado)
    }
}