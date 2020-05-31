fun main(args: Array<String>) {

    println("Please enter an INTEGER VALUE")

    try {
        var myIntegerValue: Int = readLine()!!.toInt()
        println(myIntegerValue)


    } catch (myException: Exception) {

       // myException.printStackTrace()
        println(myException.message)
    }

}