fun main(args:Array<String>)
{
    var abc = ABC().multiply(3, 5)
    println(abc)

    var xyz = ABC()
    println(xyz.multiply(3, 3))

}
class ABC {
    fun multiply(value: Int, value2: Int): Int {
        return value * value2
    }

    var a = 10
    var b = 3
    fun localFunctionExample(): Int {
        println("You called local function")

        fun innerLocalFunctionExample() {
            println("********inner local function************")
        }
        innerLocalFunctionExample()
        return a * b


        localFunctionExample()

        println("Main function starts")

        print(flag)
    }
    fun foo(i: Int ): Int{
        var a =  i
        return a
    }
    inline var flag : Boolean
        get() = foo(10 ) == 10
        set(flag) {flag}
}



// inlined function
inline fun inlinedFunc( lmbd1: () -> Unit, lmbd2: () -> Unit  ) {
    lmbd1()
    lmbd2()
}



