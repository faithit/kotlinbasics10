/*
else .if..used to add another condition to test
age<13- a child
age>13 ..17  teenager
18-25-young adult
25>60 adult
60>senior citizen
 */
fun main(){
    println("please enter your age:")
    val age=readLine()?.toIntOrNull()
    if(age != null) {
        if (age < 13) {
            println("you are a child")
        } else if (age in 13..17) {
            println("you are a teenager")
        } else if (age in 18..25){
            println("you are a young adult")
        }else if(age  in 26..59){
            println("you are an adult")
        }else{
            println("you are a senior citizen")
        }
    }else{
        println("enter a valid number")
    }
    //a program that that asks user  for marks  and prints the grade
    println("enter you marks(0-100): ")
    val marks=readLine()?.toIntOrNull()
    if(marks!=null && marks in 0..100) {
        if(marks>=80){
            println("Grade A")
        }else if(marks >=70){
            println("GRADE B")
        }else if(marks>=60){
            println("GRADE C")
        }else if(marks>=50){
            println("GRADE D")
        }else{
            println("FAIL")
        }
    } else{
    println("invalid input!enter a valid number btwn 0--100")
}
}