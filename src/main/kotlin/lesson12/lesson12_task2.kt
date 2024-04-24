package lesson12

class NewWeather(
    var dayTemp: Int,
    var nightTemp: Int,
    var isPrecipitation: Boolean,
){
    fun showInfo(){
        println("Дневная темпертаура - $dayTemp, ночная температура - $nightTemp, осадки - $isPrecipitation")
    }
}

fun main(){
    val newDay = NewWeather(5,0,false)
    newDay.showInfo()
}