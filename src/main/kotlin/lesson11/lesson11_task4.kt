package lesson11

class RecipeCategory (
    val categoryName: String,
    val categoryDescription: String,
    val categoryPhoto: String,
    val listOfRecipes: MutableList<Recipe>
)

class Recipe(
    val recipeName: String,
    val recipeDescription: String,
    val ingredients: MutableList<Ingredient>,
    val cookingTime: String,

)

class Ingredient(
    val ingredientName: String,
    val ingredientAmount: Int,
    val measure: String,
    val ingredientToDo: String,
)
