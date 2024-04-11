package lesson11

class RecipeCategory (
    val categoryName: String,
    val categoryDescription: String,
    val categoryPhoto: String
)

class Recipe(
    val recipeName: String,
    val recipeDescription: String,
    val ingredients: MutableList<String>,
    val cookingTime: String,

)

class Ingredients(
    val ingredientName: String,
    val ingredientAmount: Int,
    val measure: String,
    val ingredientToDo: String,
)

fun main(){
    val burgersCategory = RecipeCategory("Бургеры", "Рецепты всех популярных видов бургеров",
        "https/photo")
    val cheeseburger = Recipe("Рецепт чизбургера", "Невероятно легкий рецепт вкусного чизбургера",
        mutableListOf("Творог", "Куриное яйцо", "Пшеничная мука",
        "Подсолнечное масло", "Сахар"), "30 минут")
    val tomato = Ingredients("помидор", 1, "шт", "нарезать кольцами")
}