import java.util.*

fun main(){

    val input = Scanner(System.`in`)
    print("Enter first no. : ")
    val num1= input.nextFloat()
    print("Enter second no. : ")
    val num2= input.nextFloat()
    print("Enter the operator (+,-,*,/,%) : ")
    val func: String = input.next()
    val result: Float = when(func){
        "+" -> num1+num2
        "-" -> num1-num2
        "*" -> num1*num2
        "/" -> num1/num2
        "%" -> num1%num2
        else -> 0.0f
    }
    print("$num1 $func $num2 = $result")
}