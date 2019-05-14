
import java.util.*

fun main() {
    val age:Int
    val name:String

    println("enter your age: ")
    val input = Scanner(System.`in`)
    age = input.nextInt()
//    println("enter your name: ")
//    name = input.next()

   // println("your name is $name and age is $age")

    val message  = when{
        age < 10 -> "not eligible for vote"
        age >= 20 -> "eligible for vote"
        else ->"you are not indian"
    }
    print(message)
}