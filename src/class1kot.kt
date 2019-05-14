import java.util.*

fun main(){

    var num1:Int
    var num2:Int
    var func:String
    val input = Scanner(System.`in`)
    print("Enter first no. : ")
    num1 = input.nextInt()
    print("Enter second no. : ")
    num2 = input.nextInt()
    print("Enter the operator : \n1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)\n5.Modulus(%)\n")
    func = input.next()
    when(func){
        "+" -> print(num1+num2)
        "-" -> print(num1-num2)
        "*" -> print(num1*num2)
        "/" -> print(num1.toFloat()/num2.toFloat())
        "%" -> print(num1%num2)
    }
}