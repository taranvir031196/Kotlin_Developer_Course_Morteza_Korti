fun main(args: Array<String>) {


    var arrayInt = Array<Int>(5){3} // 01234

    println(arrayInt[0])
    println(arrayInt[1])
    println(arrayInt[2])
    println(arrayInt[3])
    println(arrayInt[4])
   // println(arrayInt[5])

    arrayInt[3] = 47

    println()
    println(arrayInt[3])

    println()

    println("All array elements")
    for (item in arrayInt) {
        println(item)
    }


    println()

    println("All array elements by index")

    for (number in 0..4) {

        println(arrayInt[number])
    }



    // String Array
    var stringArray = Array<String>(4){"Hello"}

    println()

    println(stringArray)

    for (myVar in stringArray) {
        println(myVar)
    }

    for (index in 0..3) {

        stringArray[index] = readLine()!!
        println("$index - " + stringArray[index])
    }



}