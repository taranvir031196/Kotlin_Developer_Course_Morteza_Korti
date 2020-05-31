fun main(args: Array<String>) {


    var lion = Animal("Lion")
    lion.start()

    lion.join()

    var tiger = Animal("Tiger")
    tiger.start()

    var leopard = Animal("Leopard")
    leopard.start()

    var bear = Animal("Bear")
    bear.start()

    var sss = S


}

class Animal: Thread {

    var animalName: String = ""

    constructor(name: String) {

        animalName = name
    }

    override fun run() {
        super.run()

        var counter = 0

        while (counter < 5) {

            println("$animalName is running - $counter")
            counter++

            try {

                Thread.sleep(2000)

            } catch (e: Exception) {

                println(e.message)
            }
        }

    }

}

class S {

}