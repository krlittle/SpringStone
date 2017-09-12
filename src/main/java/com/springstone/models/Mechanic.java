package com.springstone.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mechanic {

    @JsonProperty("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
