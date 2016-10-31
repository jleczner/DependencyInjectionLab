package application.dependencies;


import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by jonathanleczner on 10/31/16.
 */
public class RandomGenerationStrategy implements GenerationStrategy {

    public int next() {
        return ThreadLocalRandom.current().nextInt();
    }
}
