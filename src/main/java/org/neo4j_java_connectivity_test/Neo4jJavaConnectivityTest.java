package org.neo4j_java_connectivity_test;

import org.neo4j.driver.*;

public class Neo4jJavaConnectivityTest {
    public static void main(String[] args) {
        System.out.println("Hello world! It's me, neo4j_java_connectivity_test v0.1!");

        AppUtils.loadProperties();

        Driver neo4jDriver = AppUtils.initNeo4jDriver();

        String jwtSecret = AppUtils.getJwtSecret();
    }
}