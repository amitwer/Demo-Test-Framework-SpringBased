package springbasedframework.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("unused")
public class Book {
    @JsonProperty("_id")
    private String id;
    @JsonProperty("name")
    private String pages;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}