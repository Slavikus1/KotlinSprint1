package lesson17

class Folder(
    secret: Boolean,
    title: String,
    count: Int,
) {
    var activeSecretFlag = secret
    var name = title
        get() = if (activeSecretFlag) "скрытая папка" else field
    var numberOfFiles = count
        get() = if (activeSecretFlag) 0 else field
}

fun main() {
    var folder = Folder(true, "Secret", 10)
    folder.activeSecretFlag = true
    println(folder.name)
    println(folder.numberOfFiles)
}