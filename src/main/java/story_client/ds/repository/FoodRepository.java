package story_client.ds.repository;


import story_client.ds.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FoodRepository extends JpaRepository<Food, UUID> {
    Food findByName(String name);

    Food findFoodById(UUID id);
}