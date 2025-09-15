//class is a blueprint forn  creating objects
//contains properties and methods
class Student{
    //properties
    var name:String=""
    var age:Int=0
    var course:String=""
    var studentid:String=""
    // method to diplay all student details
    fun displayinfo(){
        println("student details:name $name,Age: $age, Course : $course  ID: $studentid")
    }

}
fun main(){
    //onject is an instance of a class
    //creating an object  from an instance of a class
     val student1=Student()
    //initilizing properties of student object
    student1.name="chris"
    student1.age=19
    student1.course="mit"
    student1.studentid="mt101"
    //call the function displayinfo
    student1.displayinfo()
    //create another object


}