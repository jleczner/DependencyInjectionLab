package application.dependencies;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOddGenerationStrategy {


    @Test
    public void testOddNumberGeneration(){
        OddGenerationStrategy ogs = new OddGenerationStrategy();
        assertEquals(1, ogs.next());
        assertEquals(3, ogs.next());
        assertEquals(5, ogs.next());
        assertEquals(7, ogs.next());

    }

}
