package story_client.ds.controller;

import story_client.ds.entity.Food;
import story_client.ds.service.FoodsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/Food")
@AllArgsConstructor
@NoArgsConstructor
public class FoodsController {

    @Autowired
    private FoodsService FoodsService;

    @PostMapping
    public Food createFood(@RequestBody Food Food) {
        return FoodsService.addFood(Food);
    }

    @GetMapping
    public List<Food> getAllFoods() {
        return FoodsService.getAll();
    }

    @GetMapping(path = "{id}")
    public Food getFoodById(@PathVariable(value = "id") UUID id) {
        Food Food = FoodsService.getById(id);
        return Food;
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteFood(@PathVariable(value = "id") UUID id)  {
        FoodsService.deleteFoodById(id);
        return ResponseEntity.noContent().build();
    }

}
