package kr.ac.kumoh.s20220636.w25_food_backend.repository

import kr.ac.kumoh.s20220636.w25_food_backend.model.Food
import org.springframework.data.mongodb.repository.MongoRepository

interface FoodRepository : MongoRepository<Food, String> {

    fun findByTitle(title: String): List<Food>
}