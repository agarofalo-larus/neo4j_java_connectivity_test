package org.neo4j_java_connectivity_test;

import org.neo4j.driver.*;
import static org.neo4j_java_connectivity_test.CypherQueries.*;


public class Neo4jJavaConnectivityTest {
    public static void main(String[] args) {
        System.out.println("Hello world! It's me, neo4j_java_connectivity_test v0.2!");

        AppUtils.loadProperties();

        Driver neo4jDriver = AppUtils.initNeo4jDriver();

        String jwtSecret = AppUtils.getJwtSecret();

        var results = neo4jDriver.executableQuery(MOVIE_QUERY).execute();

        var records = results.records();

        System.out.println(records);
    }
}