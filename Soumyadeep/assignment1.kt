import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    print("Enter 1st number : ")
    val num1 = sc.nextFloat()
    print("Enter 2nd number : ")
    val num2 = sc.nextFloat()
    print("What do you want to perform? ( + , - , * , / ) : ")
    val choice = sc.next()
    val result:Float = when(choice){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> 0.0f
    }
    print("Result is : $result")
}