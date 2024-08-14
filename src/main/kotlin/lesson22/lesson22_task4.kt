package lesson22

class MainScreenViewModel {
    var mainScreenState: MainScreenState = MainScreenState()
    fun loadData(data: String?) {
        var newState = MainScreenState()
        when (data) {
            null -> newState = mainScreenState.copy(null, false)
            "загрузка данных" -> newState = mainScreenState.copy("загрузка данных", true)
            "наличие загруженных данных" -> newState = mainScreenState.copy("наличие загруженных данных", false)
            else -> println("Такого вида данных нет")
        }
        mainScreenState = newState
    }
}

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false,
)

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData("загрузка данных")
    println(viewModel.mainScreenState)
}