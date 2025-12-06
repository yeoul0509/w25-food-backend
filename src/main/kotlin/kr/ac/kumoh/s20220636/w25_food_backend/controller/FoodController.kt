package kr.ac.kumoh.s20220636.w25_food_backend.controller

import kr.ac.kumoh.s20220636.w25_food_backend.model.Food
import kr.ac.kumoh.s20220636.w25_food_backend.service.FoodService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/foods")
@CrossOrigin(origins = ["http://localhost:5173"])
class FoodController(
    private val service: FoodService
) {
    @GetMapping
    fun getAllFoods(): List<Food> = service.getAllFoods()

    @GetMapping("/{id}")
    fun getFoodById(@PathVariable id: String): Food? = service.getFoodById(id)
}
