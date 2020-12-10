package story_client.ds.service.impl;

import story_client.ds.entity.Food;
import story_client.ds.repository.FoodRepository;
import story_client.ds.service.FoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public final class FoodsServiceImpl implements FoodsService {

    @Autowired
    private FoodRepository FoodRepository;

    @Override
    public Food addFood(Food Food) {
        Food savedFood = FoodRepository.save(Food);
        return savedFood;
    }

    @Override
    public List<Food> getAll() {
        return FoodRepository.findAll();
    }

    @Override
    public Food getById(UUID id) {
        Food Food = FoodRepository.findById(id).get();
        return Food;
    }

    @Override
    public Food getByName(String name) {
        return FoodRepository.findByName(name);
    }

    @Override
    public void deleteFoodById(UUID id) {
        FoodRepository.deleteById(id);
    }
}
