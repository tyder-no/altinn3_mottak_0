package no.ssb.mottak;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
        public void testGetResourcePath() {
        // Get the resource using the ClassLoader
        URL resourceUrl = getClass().getClassLoader().getResource("form_ea479ef26c49_1.xml");

        // Convert URL to File to get the absolute path
        File resourceFile = new File(resourceUrl.getPath());
        System.out.println("Path to form_ea479ef26c49_1.xml: " + resourceFile.getAbsolutePath());
    }

  
    
}
