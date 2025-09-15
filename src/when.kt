
fun main(){
    //when expression
//a program that asks user to enter a number then displays
//the day of the week
println("enter a number to display the day of the week:")
    var num=readLine()?.toIntOrNull()
    when(num){
        1 -> println("Today is monday")
        2 -> println("Today is tuesday")
        3 -> println("Today is wedsday")
        4 -> println("Today is thursday")
        5 -> println("Today is friday")
        6 -> println("Today is saturday")
        7 -> println("Today is sundayy")
        else ->println("enter a number btwn 1..7")
    }
//ask user for marks then print the grade using when  expresion
    println("please enter your mark:")
    val marks= readLine()?.toIntOrNull()
    if (marks!==null && marks in 1..100) {
        when {
            marks >= 80 -> println("grade  A")
            marks >=70 -> println("grade  B")
            marks >=60-> println("grade  C")
            marks >= 50 -> println("grade  D")
            else -> println("Fail")
        }
    } else{
        print("enter a valid  mark btwn 1..100")
    }
    /*write a program that asks  user for age
    then determines the movie ticket price based on age
    <5 years=free
    5-18=200  age in 5..17 ->
    18-25=500
    above 25=1000

     */

}
