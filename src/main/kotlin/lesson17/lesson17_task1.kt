package lesson17

class Quiz(q: String, a: String) {
    var question = q
        get() = field

    var answer = a
        get() = field
        set(value: String) {
            field = value
        }
}