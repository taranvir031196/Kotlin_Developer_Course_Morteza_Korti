fun main(args: Array<String>) {



    var myPerson = Person()
    myPerson.name = "Aaron"
    println(myPerson.name)

    var myStudent = Student()
    myStudent.name = "Mark"
    println(myStudent.name)
    myStudent.studentID = 1234567
    println(myStudent.studentID!!)



}

open class Person() {


    var name: String? = null
    var age: Int? = null
    var height: Int? = null

}

class Student(): Person() {

//    var name: String? = null
//    var age: Int? = null
//    var height: Int? = null
    var studentID: Int? = null


}

class Employee(): Person() {

//    var name: String? = null
//    var age: Int? = null
//    var height: Int? = null
    var employeeID: Int? = null


}

