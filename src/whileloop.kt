fun main(){
    /*while(condition){
    //block of code to be executed if condition is true
    }
     */
    var x=1
    while(x<=5){
        println(x)
        x++
    }
    //use a while loop to print 10..1
    /*do{
    //block  of code to be executed if condition is true
    }while(condition)
     */
     var z=5
    do{
        println("the value of z is $z")
        z++
    }while(z<=10)
    //validating pin entry.ensures user enetr four digit pin
    var pin:String
    do{
        println("Enter a four digit pin:")
        pin=readln()
    }while(pin.length!=4 || pin.toIntOrNull()==null)
    println("pin accepted")
}