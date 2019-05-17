import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    println("Enter first number : ")
    val a= input.nextInt()
    println("Enter second number : ")
    val b= input.nextInt()
    println("Enter choice(+,-,*,/,%) : ")
    val choice:String= input.next()
    val result = {a:Int,b:Int,choice:String ->
        when(choice){
            "+" -> a+b
            "-" -> a-b
            "*" -> a*b
            "/" -> a/b
            "%" -> a%b
            else -> 0
        }
    }

    //val c = a calculate b
    println("$a $choice $b = "+result(a,b,choice))
}

//infix fun Int.calculate(other:Int){
//
//}