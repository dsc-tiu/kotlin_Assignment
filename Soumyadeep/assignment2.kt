import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    print("Enter 1st number : ")
    val num1 = sc.nextFloat()
    print("Enter 2nd number : ")
    val num2 = sc.nextFloat()
    print("What do you want to perform? ( + , - , * , / ) : ")
    val choice = sc.next()
    val add = {x:Float,y:Float-> x+y}
    val sub = {x:Float,y:Float -> x-y}
    val mult = {x:Float,y:Float -> x*y}
    val div = {x:Float,y:Float -> x/y}
    val result:Float = when(choice){
        "+" -> add(num1,num2)
        "-" -> sub(num1,num2)
        "*" -> mult(num1,num2)
        "/" -> div(num1,num2)
        else -> 0.0f
    }
    print("Result is : $result")
}