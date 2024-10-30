package org.neo4j_java_connectivity_test;

public class CypherQueries {

    public final static String SHOW_DATABASE_QUERY = "SHOW DATABASES";

    public final static String SHOW_ROLES_QUERY = "SHOW ROLES";

    public final static String MOVIE_QUERY = "MATCH (p:Person) RETURN p.name AS name";
}
