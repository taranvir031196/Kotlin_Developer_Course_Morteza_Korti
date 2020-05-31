fun main(args: Array<String>) {


    var mySamsungGalaxy = SamsungGalaxy.theOnlyGalaxyS8Instance
    mySamsungGalaxy.name = "Galaxy Note"

    println(mySamsungGalaxy.name)

    var yourSamsungGalaxy = SamsungGalaxy.theOnlyGalaxyS8Instance

    println(yourSamsungGalaxy.name)


}


class SamsungGalaxy {

    var name: String = "Galaxy S8"

  private constructor() {
        println("$name is created")
    }

    companion object {
        val theOnlyGalaxyS8Instance: SamsungGalaxy by lazy { SamsungGalaxy()}
        // Everytime the this instance is sent back.
        // This instance is created only once
    }

}