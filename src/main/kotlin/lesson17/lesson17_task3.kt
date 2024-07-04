package lesson17

class Folder(){
    var activeSecretFlag: Boolean = false
    var name = ""
        get() = if (activeSecretFlag) field = "скрытая папка" else field
    var numberOfFiles = 0
        get() = if (activeSecretFlag) field = 0 else field
}

fun main(){
    var folder = Folder()
    folder.activeSecretFlag = true
    println(folder.name)
    println(folder.numberOfFiles)
}