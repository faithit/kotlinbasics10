class Car{
    //properties
    var color:String=""
    var model:String=""
    var brand:String=""
    var topspeed:Int=0
    //method to display car details
    fun  displayDetails(){
        println("The car is :brand: $brand of model $model in color $color with a topspeed of $topspeed")
    }

}
fun main(){
    //creating an object
    val car1=Car()
    //initializing the properties
    car1.color="yellow"
    car1.brand="bmw"
    car1.model="x5"
    car1.topspeed=200
    //callthe displaydetails
    car1.displayDetails()
}