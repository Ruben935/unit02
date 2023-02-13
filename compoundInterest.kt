import kotlin.math.*
fun main(args: Array<String>)
{
    println("Enter the amount originally deposited: ")
    var principal = Integer.valueOf(readLine())

    println("Enter the amount of annual interest rate paid: ")
    var annual = Integer.valueOf(readLine())

    println("Enter the amount of times per year compounded: ")
    var compound = Integer.valueOf(readLine())

    println("Enter the amount of years the account will be left to earn interest: ")
    var yearsLeft = Integer.valueOf(readLine())

    var exponent = compound * yearsLeft

    var calculate = principal *(1 + (annual / compound))
    var result = Math.pow(calculate.toDouble(), exponent.toDouble())
    println("The amount of money that will be in the account after " + yearsLeft + " is: " + result)

}
