package story_client.ds.service.impl;

import story_client.ds.entity.Terrain;
import story_client.ds.repository.TerrainRepository;
import story_client.ds.service.TerrainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public final class TerrainsServiceImpl implements TerrainsService {

    @Autowired
    private TerrainRepository TerrainRepository;

    @Override
    public Terrain addTerrain(Terrain Terrain) {
        Terrain savedTerrain = TerrainRepository.save(Terrain);
        return savedTerrain;
    }

    @Override
    public List<Terrain> getAll() {
        return TerrainRepository.findAll();
    }

    @Override
    public Terrain getById(UUID id) {
        Terrain Terrain = TerrainRepository.findById(id).get();
        return Terrain;
    }

    @Override
    public Terrain getByName(String name) {
        return TerrainRepository.findByName(name);
    }

    @Override
    public void deleteTerrainById(UUID id) {
        TerrainRepository.deleteById(id);
    }
}
