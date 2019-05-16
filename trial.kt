import java.util.*
fun main(){
    val reader = Scanner(System.`in`)
    print("Enter two numbers: ")
    val first = reader.nextFloat()
    val second = reader.nextFloat()

    print("Enter an operator (+, -, *, /): ")
    val operator = reader.next()[0]


    val total={first:Float,second:Float, operator:Char->

        when (operator) {
        '+' ->  first + second
        '-' ->  first - second
        '*' ->  first * second
        '/' ->  first / second

        else ->{
            println("Error! operator is not correct")
        }
    }
    }

    System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, total(first,second,operator))

}