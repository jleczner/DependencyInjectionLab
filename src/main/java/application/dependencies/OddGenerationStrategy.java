package application.dependencies;

import org.springframework.stereotype.Service;

import javax.inject.Named;


@Service
@Named("oddNumbers")
public class OddGenerationStrategy implements GenerationStrategy{

    private int nextNum = 0;

    public int next() {
        nextNum++;
        return nextNum++;
    }
}
