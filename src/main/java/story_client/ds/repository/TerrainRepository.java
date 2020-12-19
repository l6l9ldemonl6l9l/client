package story_client.ds.repository;
import story_client.ds.entity.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain, UUID> {
    Terrain findByName(String name);

    Terrain findTerrainById(UUID id);
}
