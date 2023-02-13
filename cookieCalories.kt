fun main(args: Array<String>)
{
    println("Enter the number of cookies eaten: ")
    var cookies = Integer.valueOf(readLine())
    println(cookies)
    var consumed = cookies * 75
    println("Your calorie intake was: " + consumed + " calories.")

}
