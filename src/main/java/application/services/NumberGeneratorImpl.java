package application.services;

import application.dependencies.GenerationStrategy;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;


@Service
public class NumberGeneratorImpl implements NumberGenerator {

    GenerationStrategy generationStrategy;

    @Inject
    @Named("naturalnumbers")
    public NumberGeneratorImpl(GenerationStrategy gs){
        generationStrategy = gs;
    }

    @Override
    public int generate(){
        return generationStrategy.next();
    }

    @Override
    public String toString() {
        return this.generationStrategy.getClass().getSimpleName();
    }
}
