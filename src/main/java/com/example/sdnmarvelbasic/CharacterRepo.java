package com.example.sdnmarvelbasic;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CharacterRepo extends Neo4jRepository<Character, Long> {

    Character getComicCharacterByName(String name);
}
