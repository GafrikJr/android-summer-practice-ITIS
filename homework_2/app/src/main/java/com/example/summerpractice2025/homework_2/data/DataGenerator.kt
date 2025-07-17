package com.example.summerpractice2025.homework_2.data

object DataGenerator {
    private val titles = listOf("Заголовок 1", "Заголовок 2", "Заголовок 3")
    private val descriptions = listOf("Описание 1", "Описание 2", "Описание 3")
    val imageUrls = listOf(
        R.drawable.1,
        R.drawable.2,
        R.drawable.3
    )

    fun generateData(count: Int): List<DataModel> {
        return (1..count).map {
            DataModel(
                id = it,
                title = titles.random(),
                description = descriptions.random(),
                imageUrl = imageUrls.random()
            )
        }
    }
}