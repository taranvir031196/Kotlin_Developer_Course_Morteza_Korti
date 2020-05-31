fun main(args: Array<String>) {


    var dictionary = HashMap<String, String>()

    dictionary.put("hello", "Salutation")
    dictionary.put("nice", "Beautiful")
    dictionary.put("fantastic", "Gorgeous")
    dictionary.put("support", "Backup")


    println(dictionary["hello"])

    println(dictionary["Hello"])

    println(dictionary["fantastic"])

    println(dictionary.get("nice"))

    println(dictionary.get("support"))

    println()

    println("All Keys")

    for (key in dictionary.keys) {

        println(key)
    }

    println()

    println("All values: ")
    for (value in dictionary.values) {

        println(value)
    }

    // Updating the HashMap
    println()
    println("Updating dictionary")
    dictionary.put("hello", "How are you!")
    println(dictionary["hello"])


    var myIntStringHashMap = HashMap<Int, String>()
    myIntStringHashMap.put(1, "V")
    var myStringIntHashMap = HashMap<String, Int>()
    myStringIntHashMap.put("K", 1)



    dictionary.remove("nice")

    println()

    for (key in dictionary.keys) {

        println(key)
    }

    for (value in dictionary.values) {
        println(value)
    }




}