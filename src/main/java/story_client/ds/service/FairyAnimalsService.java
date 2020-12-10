package story_client.ds.service;

import story_client.ds.entity.FairyAnimal;

import java.util.List;
import java.util.UUID;

public interface FairyAnimalsService {
    FairyAnimal addFairyAnimal(FairyAnimal FairyAnimal);

    List<FairyAnimal> getAll();

    FairyAnimal getById(UUID id);

    FairyAnimal getByName(String name);

    void deleteFairyAnimalById(UUID id);
}
