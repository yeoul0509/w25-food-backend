package kr.ac.kumoh.s20220636.w25_food_backend.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "foods")
data class Food(
    @Id val id: String? = null,
    val title: String,
    val calorie: Int,
    val carbohydrate: Int,
    val protein: Int,
    val fat: Int,
    val manual: String,
)
