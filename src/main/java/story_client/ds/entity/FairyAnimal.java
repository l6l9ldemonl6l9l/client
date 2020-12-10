package story_client.ds.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Data
public final class FairyAnimal {
    @Id
    private UUID id;
    @Column(unique = true)
    private String name;
    private int energy;
    private int sizeMind;

    public FairyAnimal(String name, int energy,int sizeMind){
        this.name = name;
        this.energy = energy;
        this.sizeMind=sizeMind;
    }

    public UUID getId() {
        return id;
    }
}
