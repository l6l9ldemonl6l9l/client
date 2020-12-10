package story_client.ds.service;

import story_client.ds.entity.Terrain;

import java.util.List;
import java.util.UUID;

public interface TerrainsService {
    Terrain addTerrain(Terrain Terrain);

    List<Terrain> getAll();

    Terrain getById(UUID id);

    Terrain getByName(String name);

    void deleteTerrainById(UUID id);
}
