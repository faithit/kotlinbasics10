fun main(){
    //function is block of reusable code
// that  performs a specific task
    //calling the function
    greet()
    greet()
    greatuser("jacob")
    greatuser("lucy")
    userinfo("jane",21)
    userinfo("jack",23)
 val  result= addtwonumbers(20,78)
    println(result)
   println(addtwonumbers(67,34))

}
//creating a function
fun greet(){
    println("hello goodmorning")
}
//function with a parameter
fun greatuser(name:String){
        println("hello ,how are you $name")
}
//function with multiple parameters
fun userinfo(fname:String,age:Int){
        println("hello my name is $fname and i am $age years old")
}
//function with the return keyword
fun addtwonumbers(x:Int,y:Int):Int{
    return x+y
}
//function that calculates area of rectangel

//function that calculates area of a circle