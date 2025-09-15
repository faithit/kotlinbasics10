/*for loop-loops through a collection
for(item in colection){
//code to execute the item
}
 */
fun main(){
    val students= listOf("sam","alex","patricia","elizabeth")
 //loop  through a list
    for(x in students){
        println(x)
    }
    //looping through an array
    val fruits= arrayOf("mangoes","bananas","appples","pineaple")
    for (fruit in fruits){
        println(fruit)
    }
   //looping through a range
    for(a in 2..10){
        println("The number is "+a)
    }
    //looping through a range with step
    for(z in 1..10 step 2){
        if(z==5) break //terminates the loop when z==5
        println(z)
    }
}
