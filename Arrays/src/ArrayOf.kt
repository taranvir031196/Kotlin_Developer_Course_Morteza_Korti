fun main(args: Array<String>) {

    var partyNames = arrayOf("john", "liza", "mark")

    println(partyNames[0])
    println(partyNames[1])
    println(partyNames[2])

    //println(partyNames[7])

    var partyList = listOf<String>("Angela", "Aaron", "Peter")
    println(partyList[2])

    //partyList[0] = "Soemthing"

    var partyListMutable = mutableListOf<String>("Guest 1", "Guest 2", "Guest 3")
    partyListMutable[0] = "Someone else"



    var partArrayList = arrayListOf<String>("A", "B", "C", "D")
    partArrayList.add("E")

    partArrayList.remove("B")

    println()

    for (myVar in partArrayList) {
        println(myVar)
    }





}