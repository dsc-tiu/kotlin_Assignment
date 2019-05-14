package Calculator

import java.util.*

fun main(){

    val reader = Scanner(System.`in`)
    print("Enter two nos : ")

    val a = reader.nextFloat()
    val b = reader.nextFloat()

    print("Enter an operator(+,-,*,/) : ")
    val choice = reader.next()!!

    val result: Float=when(choice){
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b

        else -> 0.0f
    }

    println("$a $choice $b = $result")
}