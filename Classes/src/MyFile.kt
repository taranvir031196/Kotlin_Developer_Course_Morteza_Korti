fun main(args: Array<String>) {


    var myCar: Car2 = Car2()


    myCar.speed = 200

    println(myCar.speed)



    var yourCar = Car2()


    yourCar.power = 1000

    println(yourCar.power)

    println(yourCar.speed)


    println(Car2().numberOfWheels)




}


class Car2 {


    var speed: Int = 0
    var power: Int = 0
    var name: String = ""
    var numberOfWheels: Int = 0




}