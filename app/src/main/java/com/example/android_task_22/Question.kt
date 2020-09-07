package com.example.android_task_22

/*
Question("a 'val' and 'var' are the same", false),
Question("In Kotlin 'when' replaces the 'switch' statement", true),
Question("You can write for loops just like in Java", false),
Question("It is easier to write code in Kotlin", true),
Question("Kotlin is newer then Java", true)*/

data class Question(
    var question:String,
    var isTrue:Boolean
) {
    companion object {
        val QUESTIONS = arrayOf(
            "a 'val' and 'var' are the same",
            "In Kotlin 'when' replaces the 'switch' statement",
            "You can write for loops just like in Java",
            "It is easier to write code in Kotlin",
            "Kotlin is newer then Java"
        )

        val QUESTIONS_IS_TRUE = arrayOf(
            false,
            true,
            false,
            true,
            true
        )
    }
}