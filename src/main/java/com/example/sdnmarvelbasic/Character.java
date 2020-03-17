package com.example.sdnmarvelbasic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
public class Character {
    @Id
    @GeneratedValue
    private Long id;

    private String name, description, image;

    @Relationship(type = "APPEARS_IN")
    @JsonIgnoreProperties("characters")
    private List<Comic> characterComics = new ArrayList<>();

    public Character() {
    }

    public Character(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public Long getId() {
        return id;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Comic> getCharacterComics() {
        return characterComics;
    }

    public void setCharacterComics(List<Comic> characterComics) {
        this.characterComics = characterComics;
    }
}
