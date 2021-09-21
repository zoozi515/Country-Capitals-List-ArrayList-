fun main(){
    val capital_city = mutableMapOf<Any, Any?>()

    if (capital_city.isEmpty()){
        for(i in 1..3){
            print("Enter a country: ")
            val country = readLine().toString()

            print("Enter its capital city country: ")
            val city = readLine().toString()

            capital_city[country] = city
        }

        println("\nThe Capital City Map Contains: \n" + capital_city)
    }

}