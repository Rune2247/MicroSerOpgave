package dk.eaaa.domain;

import java.util.UUID;

public class Id

{
    private final UUID id;

    public Id(UUID id) {
        this.id = id;
    }
    public Id(String id){
        this.id = UUID.fromString(id);
    }

    public UUID getId() {
        return id;
    }
    public String getRaw(){
        return id.toString();
    }
}
