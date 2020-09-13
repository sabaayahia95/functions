fun main(args:Array<String>)
{
    var exp = ExampleForApply()
    exp.apply {
        justPrint("hello")
      var  i=200
    }.printIvalue()

    var str:String? = "I have never watched star-wars"
    if(str != null){
        lengthOfStringNormalMethod(str)
    }else{
        println("It is a null value")
    }
    var str:String? = "chercher tech"
    // calling a function on nullable type variable
    str?.toUpperCase()
    // passing the nullable type argument to a function
    // which accept only non-nullable
    str?.let { justPrint(str) }
}
// function accept non-nullable string
fun justPrint(tobePrinted:String){
    println("I am here to print : $tobePrinted")
}
fun sampleFunction() = with(ExampleForApply()){
    justPrint("hello")
    printValue()
}


class ExampleForApply{
    var I =100;
    fun justPrint(tobePrinted:String){
        println("I am here to print : $tobePrinted")
    }
    fun printIvalue(){
        println("The I value is  : $i")
    }
}


// using if block t check null
fun lengthOfStringNormalMethod(str:String){
    // calling function
    println(str.toUpperCase())
    // below is calling variable
    println(str.length)

}
fun printValue(){
    println("The I value is  : $i")
}
