import java.lang.Math.random

fun main(args: Array<String>){
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    val index = arrayOf(1, 3, 4, 2)
    var y: Int
    var x = 0
    while (x < 4) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x=x+1
        //кукусики
    }
}