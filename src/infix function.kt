fun main(args:Array<String>)
{
    // using as infix functions
    for(valFun in 9 downTo 3){
        println(valFun)
    }
    println("***************")
    // not using as infix functions
    for(valFun in 9.downTo(3)){
        println(valFun)
    }
}

