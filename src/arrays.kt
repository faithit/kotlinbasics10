fun main(){
    //array is  a collection of elements stored in a single variable
    val courses= arrayOf("kotlin","css","python","HTML")
    println(courses.contentToString())
    //indexing  starts at 0
    //accesssing array element =array[index]
    println(courses[0])
    println(courses[2])
    //modifying array elemet
    courses[0]="javascript"
    println(courses[0])
    println(courses.contentToString())
    //getting the size of the array .size
    println(courses.size)
    //looping thro the array
    for (x in courses){
        println(x)
    }
    //integer array
    val mynums= arrayOf(10,56,9,7,54,23,19)
    //accesing the elements
    println(mynums[1])
    //looping through the array
    for(mynum in mynums){
        println(mynum)
    }
    //array methods .sort()
    mynums.sort()
    println(mynums.contentToString())
    //forEACH  function-lets you loop through each item in an array
    /*
    array.forEACH{item ->
    //block of code
    }
     */
    courses.forEach { x ->
        println(x)
    }
    mynums.forEach{ num ->
        println(num)
    }
    //forEachIndexed-lets you loop through each item in an array
    // and also gives you the index
    val students= arrayOf("luke","mary","james","cate")
    students.forEachIndexed{ index,y->
        println("index $index : $y")
    }


}