package story_client.ds.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.UUID;

@Data
public final class Terrain {
    @Id
    private UUID id;
    @Column(unique = true)
    private String name;
    private int sizeBeauty;

    public Terrain(String name, int sizeBeauty){
        this.name = name;
        this.sizeBeauty = sizeBeauty;
    }

    public UUID getId() {
        return id;
    }

}
