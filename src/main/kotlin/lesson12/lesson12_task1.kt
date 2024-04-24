package lesson12

class Weather{
    var dayTemp = 5
    var nightTemp = -5
    var isPrecipitation = true

    fun showInfo(){
        println("Дневная темпертаура - $dayTemp, ночная температура - $nightTemp, осадки - $isPrecipitation")
    }
}

fun main(){
    val friday = Weather()
    friday.dayTemp = 10
    friday.nightTemp = 0
    friday.isPrecipitation = false
    friday.showInfo()

    val monday = Weather()
    monday.dayTemp = 15
    monday.nightTemp = 10
    monday.isPrecipitation = true
    monday.showInfo()

}