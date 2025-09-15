class Person( val name:String,val age:Int,
    val occupation:String){

    //function to display the persons info
    fun displayinfo(){
        println("Name:$name ,Age:$age ,occupation:$occupation")
    }
}
fun main(){
    //creating an object
     val person1=Person("lucy",20,"nurse")
    //call the diplayinfo()
    person1.displayinfo()
    //create another object
    val person2=Person("john",25,"carpenntaer")
    person2.displayinfo()
}