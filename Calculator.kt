import java.util.*

fun main(){
    val scanner= Scanner(System.`in`)

    println("Enter first number: ")
    val a: Int = scanner.nextInt()
    println("Enter second number: ")
    val b: Int = scanner.nextInt()

    val add: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    val sub: (Int, Int) -> Int = {a: Int, b: Int -> a - b}
    val mul: (Int, Int) -> Int = {a: Int, b: Int -> a * b}
    val div: (Int, Int) -> Double = {a: Int, b: Int -> a.toDouble() / b.toDouble()}

//    println(add(1, 2))
    while_block@while (true) {
        println("Enter choice: ")
        println("\n\t1. Add\n\t2. Subtract\n\t3. Multiplication\n\t4. Division\n\t5. Exit")
        println("Enter your store: ")
        val choice: Int = scanner.nextInt()

        when(choice) {
            1 -> println("$a + $b = "+add(a, b))
            2 -> println("$a - $b = "+sub(a, b))
            3 -> println("$a * $b = "+mul(a, b))
            4 -> println("$a / $b = "+div(a, b))
            5 -> break@while_block
            else -> println("UNKNOWN INPUT")
        }
        println()
    }

}