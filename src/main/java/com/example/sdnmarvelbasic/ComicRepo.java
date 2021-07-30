package com.example.sdnmarvelbasic;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface ComicRepo extends Neo4jRepository<ComicIssue, Long> {

    @Query("MATCH (i:ComicIssue)-[r:INCLUDES]->(c:Character) RETURN i, collect(r), collect(c);")
    Iterable<ComicIssue> findAllComics();

    @Query("MATCH (i:ComicIssue {name: $name})-[r:INCLUDES]->(c:Character) RETURN i, collect(r), collect(c);")
    ComicIssue getComicIssueByName(String name);
}
