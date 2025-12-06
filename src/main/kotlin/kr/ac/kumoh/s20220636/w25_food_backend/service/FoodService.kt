package kr.ac.kumoh.s20220636.w25_food_backend.service

import kr.ac.kumoh.s20220636.w25_food_backend.model.Food
import kr.ac.kumoh.s20220636.w25_food_backend.repository.FoodRepository
import org.springframework.stereotype.Service

@Service
class FoodService(
    private val repository: FoodRepository
) {
    fun getAllFoods(): List<Food> = repository.findAll()
    fun getFoodById(id: String): Food? = repository.findById(id).orElse(null)
}