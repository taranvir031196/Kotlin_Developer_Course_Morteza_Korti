fun main(args: Array<String>) {

    var myAnimal = GenericAnimalClass(20)


}

class GenericAnimalClass<T>(kind: T) {


        init {
            println(kind)
        }

}