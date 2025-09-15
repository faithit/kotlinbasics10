//parent class
open class Animal{
    fun eat(){
        println("the animal eats food")
    }
}

//child class
class Dog(val color:String,val breed:String,val age:Int):Animal() {
    //method specific to dog
    fun bark() {
        println("the dog barks")
    }
    //method to diplay dog info
    fun displayinfo() {
        println("the dog is  $breed aged $age in  $color color")
    }

}
fun  main(){
    //create an object dog
    val mydog=Dog("brown","german shepherd",4)
    //calling an inherited method  from animal
    mydog.eat()
    //calling its own method
    mydog.bark()
    mydog.displayinfo()
}