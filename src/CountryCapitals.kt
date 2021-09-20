fun main(){
    val countries = listOf("Germany", "UAE", "Japan")
    val capitals = arrayListOf<String>()

    for(i in countries){
        println("What is the capital of $i?")
        capitals.add(readLine()!!)
    }

    for(i in 0..2){
        println("The capital of ${countries[i]} is ${capitals[i]}.")
    }
}