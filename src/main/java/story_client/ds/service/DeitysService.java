package story_client.ds.service;

import story_client.ds.entity.Deity;

import java.util.List;
import java.util.UUID;

public interface DeitysService {
    Deity addDeity(Deity Deity);

    List<Deity> getAll();

    Deity getById(UUID id);

    Deity getByName(String name);

    void deleteDeityById(UUID id);
}
