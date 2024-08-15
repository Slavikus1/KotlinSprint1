package lesson22

class MainScreenViewModel {
    private var mainScreenState: MainScreenState = MainScreenState()
    fun loadData() {
        var newState = mainScreenState.copy("отсутствие данных")
        println("Данные - ${newState.component1()}, процесс загрузки - ${newState.component2()}")
        Thread.sleep(1000)
        newState = mainScreenState.copy("загрузка данных", true)
        println("Данные - ${newState.component1()}, процесс загрузки - ${newState.component2()}")
        Thread.sleep(1000)
        newState = mainScreenState.copy("данные загружены", false)
        println("Данные - ${newState.component1()}, процесс загрузки - ${newState.component2()}")
    }
}

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false,
)

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}