package application.dependencies;

import application.services.NumberGeneratorFactory;
import application.services.NumberGeneratorImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by jonathanleczner on 10/31/16.
 */
public class FactoryTest {
    @Test
    public void factoryTest() {
        NumberGeneratorImpl generator = (NumberGeneratorImpl) NumberGeneratorFactory.ODDGENERATOR.getInstance();
        assertTrue(OddGenerationStrategy.class.getSimpleName().equals(generator.toString()));

        generator = (NumberGeneratorImpl) NumberGeneratorFactory.RANDOMGENERATOR.getInstance();
        assertTrue(RandomGenerationStrategy.class.getSimpleName().equals(generator.toString()));

        generator = (NumberGeneratorImpl) NumberGeneratorFactory.SEQUENTIALGENERATOR.getInstance();
        assertTrue(SequentialGenerationStrategy.class.getSimpleName().equals(generator.toString()));
    }
}
