package story_client.ds.service.impl;

import story_client.ds.entity.Deity;
import story_client.ds.repository.DeityRepository;
import story_client.ds.service.DeitysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public final class DeitysServiceImpl implements DeitysService {

    @Autowired
    private DeityRepository DeityRepository;

    @Override
    public Deity addDeity(Deity Deity) {
        Deity savedDeity = DeityRepository.save(Deity);
        return savedDeity;
    }

    @Override
    public List<Deity> getAll() {
        return DeityRepository.findAll();
    }

    @Override
    public Deity getById(UUID id) {
        Deity Deity = DeityRepository.findById(id).get();
        return Deity;
    }

    @Override
    public Deity getByName(String name) {
        return DeityRepository.findByName(name);
    }

    @Override
    public void deleteDeityById(UUID id) {
        DeityRepository.deleteById(id);
    }
}
