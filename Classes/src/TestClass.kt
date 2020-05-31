fun main(args: Array<String>) {

    var personAge = 20

    when (personAge){

        1 -> {println("The value of the personAge variable is $personAge")}
    //20-> {println("The value of the personAge variable is $personAge")}

    // 20,30 -> {println("The value of the personAge variable is $personAge")
        in 10..20 -> {println("The value of the personAge variable is $personAge")}

    }

}