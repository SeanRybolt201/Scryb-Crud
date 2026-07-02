package com.scryb.scrybcrud.domain;

import java.time.LocalDateTime;

public class crudObject {
    private String id;
    private String name;
    private String description;
    private LocalDateTime updateTimestamp;

    // Constructors
    public crudObject() {}

    public crudObject(String id, String name, String description, LocalDateTime updateTimestamp) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.updateTimestamp = updateTimestamp;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

        public LocalDateTime getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(LocalDateTime updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

}
