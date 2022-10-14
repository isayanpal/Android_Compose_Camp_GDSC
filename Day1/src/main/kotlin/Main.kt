fun main(args: Array<String>) {
    val a: Int=68

    when (a){
        //(conditon)->code
        0->println("Value of a is:0")
        in 1..40 ->println("Value of a is in the range 1-40")
        else->println("Value of a is neither 0 nor in the range 1-40")
    }
}
//fun main() {
//    val cel: Double=32.0
//    convertTempToF(cel)
//
//}
//
//
//fun convertTempToF(c: Double){
//    val fahrenhite: Double = c*((9.0)/(5.0))+32
//    println("The temp in F= $fahrenhite")
//}

// val-> immutable ,not changeable ,cannot be reassigned
// var-> changeable , can be reassigned