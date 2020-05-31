fun main(args: Array<String>) {


    subtract(10, 5)

    subtract()


}


fun subtract(firstNumber: Int = 20, secondNumber: Int = 5): Unit {

    println(firstNumber - secondNumber)
}


