package com.example.sdnmarvelbasic;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ComicRepo extends Neo4jRepository<ComicIssue, Long> {

    ComicIssue getComicIssueByName(String name);
}
