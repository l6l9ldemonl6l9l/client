package story_client.ds.service;
import story_client.ds.entity.Food;

import java.util.List;
import java.util.UUID;

public interface FoodsService {
    Food addFood(Food Food);

    List<Food> getAll();

    Food getById(UUID id);

    Food getByName(String name);

    void deleteFoodById(UUID id);
}
