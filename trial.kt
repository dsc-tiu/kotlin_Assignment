import java.util.*
fun main(){
    val reader = Scanner(System.`in`)
    print("Enter two numbers: ")
    val first = reader.nextFloat()
    val second = reader.nextFloat()

    print("Enter an operator (+, -, *, /): ")
    val operator = reader.next()[0]

    val result: Float

    when (operator) {
        '+' -> result = first + second
        '-' -> result = first - second
        '*' -> result = first * second
        '/' -> result = first / second

        else ->{
            println("Error! operator is not correct")
            return
        }
    }

    System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result)

}