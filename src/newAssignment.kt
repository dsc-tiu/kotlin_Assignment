import java.util.*

val input = Scanner(System.`in`)
fun main(){
    println("Enter first number : ")
    val a= input.nextFloat()
    println("Enter second number : ")
    val b = input.nextFloat()
    print( a calculate b)
}

infix fun Float.calculate(other: Float):String{
    println("Enter choice(+,-,*,/,%) : ")
    val choice:String= input.next()
    val res =  when(choice){
        "+" -> this + other
        "-" -> this - other
        "*" -> this * other
        "/" -> this / other
        "%" -> this % other
        else -> 0.0f
    }
    val final = "$this $choice $other =  $res"
    return final
}

