fun main(args: Array<String>) {


    var animalNames = setOf<String>("Lion", "Panther", "Cat", "Tiger", "Lion")

    for (animalName in animalNames) {
        println(animalName)
    }

   //animalNames.add("Fish")

    var mutableAnimalNames = mutableSetOf<String>("Lion", "Panther", "Cat", "Tiger", "Lion")

    mutableAnimalNames.add("Fish")

    println()

    for (animalName in mutableAnimalNames) {

        println(animalName)

    }


}