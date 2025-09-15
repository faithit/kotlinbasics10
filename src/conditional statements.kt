fun main(){
    //if-specifies ablock of code to be  executed if condtion is true
    /* if (condition){
    //block of code to be executed if condition is true
    }
     */
    val x=5
    if(x>3){
        println("$x is greater than 3")
    }
    //if ...else
    /* if (condition){
  //block of code to be executed if condition is true
  }else{
  //block of code to be executed if condition is false
  }
   */
    //a bprogram that  asks usewr  for age and checks if they can vote
    //readline()reads user input as string
    //?(Safe call operator)-prevents oretion on null values
    print("what is your age? : ")
    val age= readLine()?.toIntOrNull()
    if(age!=null)
    {
        if (age>=18){
            println("you are eligible to vote")
        }
        else{
            println("you are not eliggible to vote")
        }
    }
//even  or odd number checker hint evennum%2==0
    //check positive or negative number
    //login example
    val correctusername="admin"
    val correctpass="1234"
    println("enter a username:")
    val username=readLine()
    println("enter a password :")
    var password=readLine()
     if(username==correctusername && password==correctpass )
         println("login successfull!welcome $username")
    else{
        println("invalid username  or password")
     }
}