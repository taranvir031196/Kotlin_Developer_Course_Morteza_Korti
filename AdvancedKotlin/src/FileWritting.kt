import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {


    readFromFile()

    var str = readLine().toString()
    writeToFile(str)



}


fun writeToFile(str: String) {

    try {

        var fo = FileWriter("test.txt", true)

        fo.write(str)

        fo.close()

        println("Data is saved")
    } catch (e: Exception) {

        e.printStackTrace()

    }



}

fun readFromFile() {

    try {

        var fin = FileReader("test.txt")
        var c: Int?
        do {

            c = fin.read()
            print(c.toChar())

        } while (c != -1)

    } catch (e: Exception) {




    }

}
