import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    print("Enter 1st number : ")
    val num1 = sc.nextFloat()
    print("Enter 2nd number : ")
    val num2 = sc.nextFloat()
    print("What do you want to perform? ( + , - , * , / ) : ")
    val choice = sc.next()
    val result = {x:Float,y:Float,ch:String -> when(ch){
        "+" -> x add y
        "-" -> x subtract y
        "*" -> x multiply y
        "/" -> x divide y
        else -> 0.0f
    }}
    print("Result is : ${result(num1,num2,choice)}")
}

infix fun Float.add(other:Float):Float{
    return this + other
}
infix fun Float.subtract(other:Float):Float{
    return this - other
}
infix fun Float.multiply(other:Float):Float{
    return this * other
}
infix fun Float.divide(other:Float):Float{
    return this / other
}