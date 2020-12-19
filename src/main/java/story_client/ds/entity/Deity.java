package story_client.ds.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;


@Data
public final class Deity {
    @Id
    private UUID id;
    @Column(unique = true)
    private String name;
    private int age;

    public Deity(String name, int age){
        this.id=UUID.randomUUID();
        this.name = name;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }
}
