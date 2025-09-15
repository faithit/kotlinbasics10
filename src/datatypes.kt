fun main(){
    //strings
    val course="kotlin"
    val lname:String="jane"
    println("i am learning "+course)
    println(lname)
    //numeric datatypes-int,byte,short,long
    val age=20
    val marks:Int=57
    val mynum:Byte=120
    val mynewnum:Long=23345555555555555L
    println(marks)
    println(mynum ::class)
    println(mynewnum)
    //floating point double,float
    val tax=10.65
    val rate:Float=10.67f
     println("The tax rate is "+tax+"and the rate is "+rate)
//boolean:true or false
    val isstudent=true
    println(isstudent)
    //char:stores a single character
    val grade='A'
    println(grade::class)
    //typeconversion //toInt(),toFloat,toLONG
    val x:Float=10.65f
    val y=x.toInt()
    print(y)

}