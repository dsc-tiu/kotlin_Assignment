package Calculator

import java.util.*

fun main(){

    val reader = Scanner(System.`in`)
    print("Enter two nos : ")

    val a = reader.nextFloat()
    val b = reader.nextFloat()

    var add = {x:Float,y:Float -> x+y}
    var sub = {x:Float,y:Float -> x-y}
    var mult = {x:Float,y:Float -> x*y}
    var div = {x:Float,y:Float -> x/y}

    print("Enter an operator(+,-,*,/) : ")
    val choice = reader.next()!!

    val result: Float=when(choice){
        "+" -> add(a,b)
        "-" -> sub(a,b)
        "*" -> mult(a,b)
        "/" -> div(a,b)

        else -> 0.0f
    }

    println("$a $choice $b = $result")
}