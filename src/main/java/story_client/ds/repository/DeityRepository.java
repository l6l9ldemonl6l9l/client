package story_client.ds.repository;

import story_client.ds.entity.Deity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DeityRepository extends JpaRepository<Deity, UUID> {
    Deity findByName(String name);

    Deity findByDeityId(UUID id);
}
