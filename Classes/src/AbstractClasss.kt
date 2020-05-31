
fun main(args: Array<String>) {

   // var myAnimal = AnimalClass() //
  //   Abstract classes can not be instantiated


    var myLion = LionClass()
    println(myLion.getName() + " - " + myLion.getLionSpeed())

    var myTiger = TigerClass()
    println(myTiger.getName() + " - "  + myTiger.getSpeed())


}


abstract class AnimalClass {


    abstract fun getName(): String

   open fun getSpeed(): Int {

        return 2000
    }

}


class LionClass: AnimalClass() {

    override fun getName(): String {
        return "Lion"
    }

    fun getLionSpeed(): Int {

        return getSpeed()

    }

}

class TigerClass: AnimalClass() {

    override fun getName(): String {
        return "Tiger"
    }

//    fun getTigerSpeed(): Int {
//
//        return getSpeed()
//    }

    override fun getSpeed(): Int {

        return 5000
    }
}







