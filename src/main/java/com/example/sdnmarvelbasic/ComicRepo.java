package com.example.sdnmarvelbasic;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ComicRepo extends Neo4jRepository<Comic, Long> {

    Comic getComicByTitle(String title);
}
