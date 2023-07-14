package neo4j_java_connectivity_test;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.neo4j.driver.Driver;
import org.neo4j_java_connectivity_test.AppUtils;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConnectionTestNeo4j {

    @Test
    void connectToNeo4j() {
        AppUtils.loadProperties();
        assertNotNull(AppUtils.getNeo4jUsername(), "neo4j username found");
        assertNotNull(AppUtils.getNeo4jPassword(), "neo4j password found");
        assertNotNull(AppUtils.getNeo4jUri(), "neo4j uri found");

        Driver driver = AppUtils.initNeo4jDriver();
        Assumptions.assumeTrue(driver != null);
        assertNotNull(driver, "driver created");
        assertDoesNotThrow(driver::verifyConnectivity, "unable to connect to neo4j");
    }
}
