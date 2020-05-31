fun main(args: Array<String>) {

    var myComputer: ComputerX = Nexus() // Up Casting - Automatically occurs
    println(myComputer.computerName)

    var myNexus: Nexus = ComputerX() as Nexus // Down Casting - Doesn't automatically occur

}

open class ComputerX {

     var computerName: String = "Nexus"
}

class Nexus: ComputerX() {

}


