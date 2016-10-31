package application.services;

import application.dependencies.OddGenerationStrategy;
import application.dependencies.RandomGenerationStrategy;
import application.dependencies.SequentialGenerationStrategy;
import org.springframework.stereotype.Service;

/**
 * Created by jonathanleczner on 10/31/16.
 */
@Service
public enum NumberGeneratorFactory {
    ODDGENERATOR {
        @Override
        public NumberGenerator getInstance() {
            return new NumberGeneratorImpl(new OddGenerationStrategy());
        }
    },
    RANDOMGENERATOR {
        @Override
        public NumberGenerator getInstance() {
            return new NumberGeneratorImpl(new RandomGenerationStrategy());
        }
    },
    SEQUENTIALGENERATOR{
        @Override
        public NumberGenerator getInstance() {
            return new NumberGeneratorImpl(new SequentialGenerationStrategy());
        }
    };

    public abstract NumberGenerator getInstance();
}
