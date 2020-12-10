package story_client.ds.service.impl;

import story_client.ds.entity.FairyAnimal;
import story_client.ds.repository.FairyAnimalRepository;
import story_client.ds.service.FairyAnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public final class FairyAnimalsServiceImpl implements FairyAnimalsService {

    @Autowired
    private FairyAnimalRepository FairyAnimalRepository;

    @Override
    public FairyAnimal addFairyAnimal(FairyAnimal FairyAnimal) {
        FairyAnimal savedFairyAnimal = FairyAnimalRepository.save(FairyAnimal);
        return savedFairyAnimal;
    }

    @Override
    public List<FairyAnimal> getAll() {
        return FairyAnimalRepository.findAll();
    }

    @Override
    public FairyAnimal getById(UUID id) {
        FairyAnimal FairyAnimal = FairyAnimalRepository.findById(id).get();
        return FairyAnimal;
    }

    @Override
    public FairyAnimal getByName(String name) {
        return FairyAnimalRepository.findByName(name);
    }

    @Override
    public void deleteFairyAnimalById(UUID id) {
        FairyAnimalRepository.deleteById(id);
    }
}