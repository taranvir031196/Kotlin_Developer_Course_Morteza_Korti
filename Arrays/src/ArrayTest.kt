fun main(args: Array<String>) {


    var partyNames = Array<String>(10){""} // 0 1 2 3 4 5 6 7 8 9

    partyNames[0] = "John"

    println(partyNames[0])

    partyNames[1] = "Liza"

    println(partyNames[1])

    println()

    println("All Party Names")

    for (myVar in partyNames) {

        println(myVar)

    }


    println()

    println("All party names by using Index")

    partyNames[2] = "A"
    partyNames[3] = "B"
    partyNames[4] = "C"
    partyNames[5] = "D"
    partyNames[6] = "E"
    partyNames[7] = "F"
    partyNames[8] = "G"
    partyNames[9] = "H"


    for (myVar in 0..9) {

        println(partyNames[myVar])

    }


    println()

    println("All party names invited by the user")

    for (myVar in 0..9) {

        partyNames[myVar] = readLine()!!
        println("" + partyNames[myVar] + " is invited to the party.")

    }


}