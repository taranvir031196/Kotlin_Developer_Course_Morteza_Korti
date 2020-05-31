fun main(args: Array<String>) {

    var partyList: ArrayList<String> = ArrayList<String>()
    partyList.add("John")
    partyList.add("Vanessa")
    partyList.add("Liza")
    partyList.add("Leila")
    partyList.add("Mark")

    println("The first person invited to the party: " + partyList.get(0))
    println("The second person invited to the party: " + partyList.get(1))
    println("The third person invited to the party: " + partyList.get(2))
    println("The fourth person invited to the party: " + partyList.get(3))
    println("The final person invited to the party: " + partyList.get(4))


    println()
    for (name in partyList) {
        println(name)
    }


    println()


    partyList.set(3, "Aaron")

    println(partyList.get(3))

    println()

    println("All names:")

    for (name in partyList) {
        println(name)
    }



    println()

    if (partyList.contains("John")) {

        println("Wow. John is also invited!")

    } else {

        println("Sorry. John is not invited")

    }

    println()

    println("Party List by Index: ")

    for (index in 0..partyList.size - 1) { // 0 1 2 3 4

        println(partyList[index])
    }


    partyList.remove("Mark")


    println()

    for (index in 0..partyList.size - 1) { // 0 1 2 3 4

        println(partyList[index])
    }


    partyList.removeAt(1)

    println()

    for (index in 0..partyList.size - 1) { // 0 1 2 3 4

        println(partyList[index])
    }


}