fun main(){
    println("hello kotlin")
    println("hello good morning")
    //variable-is a named container for storing a value
    /*
   variablename=value
   val=used to declare  variables that are unchangeble
   var=used to declare variables that value will change
     */
    val fname="julias"
    println(fname)
    //var variables whose value can change
    var age=20
    println(age)
    //reassigning my age variable
    age=23
    println(age)
    //displaying strings and varibles
    println("hello my name is "+ fname)
    println("i am "+ age +" years old")
    //string interpolation
    println("my name is $fname  and i am $age years old")
   //calling a function
    hello()
}
fun hello(){
    println("This is  a kotlin function")
}