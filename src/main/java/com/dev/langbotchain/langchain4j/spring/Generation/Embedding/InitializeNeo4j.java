package com.dev.langbotchain.langchain4j.spring.Generation.Embedding;

import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.store.embedding.EmbeddingStore;
import dev.langchain4j.store.embedding.neo4j.Neo4jEmbeddingStore;
import dev.langchain4j.store.graph.neo4j.Neo4jGraph;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.SessionConfig;

public class InitializeNeo4j {
    protected static EmbeddingStore<TextSegment> initializeNeo4j(){
        return Neo4jEmbeddingStore.builder()
                .driver(GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "Password123")))
                .databaseName("neo4j")
                .dimension(384)
                .withBasicAuth("bolt://localhost:7687", "neo4j", "Password123")
                .build();
    }

    protected static Neo4jGraph initializeNeo4jGraph(){
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "Password123"));
        driver.session(SessionConfig.forDatabase("neo4j"));
        Neo4jGraph graph = Neo4jGraph.builder()
                .driver(driver)
                .build();
        return graph;
    }
}
