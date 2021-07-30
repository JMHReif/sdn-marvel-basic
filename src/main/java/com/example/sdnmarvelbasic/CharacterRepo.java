package com.example.sdnmarvelbasic;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface CharacterRepo extends Neo4jRepository<Character, Long> {

    @Query("MATCH (c:Character) RETURN c;")
    Iterable<Character> findAllCharacters();

    @Query("MATCH (c:Character {name: $name})<-[r:INCLUDES]-(i:ComicIssue) RETURN c, collect(r), collect(i);")
    Character getCharacterByName(String name);
}
