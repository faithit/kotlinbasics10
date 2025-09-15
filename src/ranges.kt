fun main(){
    //range- is a sequence of values ..

    val myrange=1..5
    for (x in myrange){
        println(x)
    }
    for(num in 10..19){
        println(num)
    }
    //range of characters
    for (char in 'c'..'n'){
        println(char)
    }
    //step
    for (i in 2..10 step 2){
        println(i)
    }
    //downTO
    for (z in 15 downTo 7){
        println(z)
    }
}