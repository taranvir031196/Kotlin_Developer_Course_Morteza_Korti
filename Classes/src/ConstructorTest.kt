fun main(args: Array<String>) {

    var animal = Animal("My Lion", "Yellow", 2000, 4000)
    var myPanther = Animal(5000)


}

class Animal(power: Int) {

    init {
        println(power)
    }


    constructor(name: String, color: String, speed: Int, power: Int): this(power) {


        println(name + " - " + color + " - " + speed + " - " + power)




    }



}