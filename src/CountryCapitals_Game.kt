import kotlin.random.Random

fun main(){
    class Country(val name: String, val capital: String){
        fun displayCountryCapital(){
            println("Country: $name - Capital City: $capital")
        }
    }
    val countries = listOf(Country("Saudi", "Riyadh"),
        Country("Qatar","Doha"), Country("Bahrain","Manama"),
        Country("Kuwait", "Kuwait"), Country("Oman","Muscat"),
        Country("UAE","Abu Dhabi"), Country("Yemen","Sana'a"),
        Country("Lebanon","Beirut"), Country("Jordan","Amman"),
        Country("Turkey","Ankara"))


    var i = 0
    var score = 0
    var question = 0

    while(i < 3){
        var country = countries[Random.nextInt(countries.size)]

        println("What is the capital city of ${country.name}? ")
        val answer = readLine()

        if(answer == country.capital){
            println("Great!!")
            score++
        } else {
            println("Wrong :(")
            country.displayCountryCapital()
        }

        if(i == 2){
            println("Game Over!\nYour Score is $score / 3\nDo you want to play again? (Y/N):")
            val play = readLine().toString()

            if (play == "Y" || play == "y"){
                i = 0
                continue
            } else if (play == "N" || play == "n"){
                println("Exited")
                break
            }
        }
        i++
    }
}