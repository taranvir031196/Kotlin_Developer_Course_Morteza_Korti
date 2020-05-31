import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {


    readFromTheExternalFile()

    println("Please enter a string value")
    var input = readLine().toString()
    writeToExternalFile(input)

}


fun writeToExternalFile(text: String) {



    try {

        var fileWriter: FileWriter = FileWriter("ExternalFile.txt")

        fileWriter.write(text)

        fileWriter.close()

        println("The text is saved")

    } catch (e: Exception) {

        println(e.message)
    }


}

fun readFromTheExternalFile() {

    try {

        var fileReader: FileReader = FileReader("ExternalFile.txt")
        var counter: Int?
        do {

            counter = fileReader.read()
            print(counter.toChar())

        } while (counter != -1)

    } catch (e: Exception) {


        println(e.message)


    }
}
