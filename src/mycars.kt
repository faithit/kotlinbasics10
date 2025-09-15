class mycars{
    var name:String=""
    var model:Int=0
    constructor()
    constructor(model: Int, name: String) {
        this.model = model
        this.name = name
    }

}
fun main(){
    var newcar=mycars()
}