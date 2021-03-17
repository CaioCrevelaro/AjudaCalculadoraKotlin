package br.com.kotlinCalculator

fun main() {

    var n1: Float? = 395.00f

    var n2: Float? = 5.00f

    var qop: String = "Inicio"



    if (n1 != null && n2 != null) {

        println("Numeros validos, segue a operação:")
        val op = 1
        var res: Float? = null

        if (op == 1) {

            res = n1.plus(n2)

            qop = "Adição"

//            else { FALTA UMA CHAVE PARA FECHAR O 'if' AQUI
        } else {

            println("Numero digitado invalido, refaça a digitação!!")
        }

//        }// ESSA CHAVE ESTÁ SOBRANDO

        if (op == 2) {

            res = n1.minus(n2)

            qop = "Subtração"

//            else { FALTA UMA CHAVE PARA FECHAR O 'if' AQUI

        } else {

            println("Numero digitado invalido, refaça a digitação!!")
        }

//        } ESSA CHAVE ESTÁ SOBRANDO

        if (op == 3) {

            res = n1.div(n2)

            qop = "Divisão"

//            else {FALTA UMA CHAVE PARA FECHAR O 'if' AQUI
        } else {

            println("Numero digitado invalido, refaça a digitação!!")
        }

//    } ESSA CHAVE ESTÁ SOBRANDO

    if (op == 4) {

        res = n1.times(n2)

        qop = "Multiplicação"

//            else { FALTA UMA CHAVE PARA FECHAR O 'if' AQUI

    } else {
        println("Numero digitado invalido, refaça a digitação!!")
    }

//        } ESSA CHAVE ESTÁ SOBRANDO

    println("Resultado da operação de $qop: $res")


} else {

    println("Valores nulos, refaça a digitação.")
}


}