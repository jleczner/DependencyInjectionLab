package application.dependencies;


import org.springframework.stereotype.Service;

import javax.inject.Named;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by jonathanleczner on 10/31/16.
 */
@Service
@Named("randomNumbers")
public class RandomGenerationStrategy implements GenerationStrategy {

    public int next() {
        return ThreadLocalRandom.current().nextInt();
    }
}
