package story_client.ds.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Data
public final class Food {
    @Id
    private UUID id;
    @Column(unique = true)
    private int taste;
    private String name;

    public Food(String name, int taste){
        this.id=UUID.randomUUID();
        this.name = name;
        this.taste = taste;

    }

    public UUID getId() {
        return id;
    }
}
