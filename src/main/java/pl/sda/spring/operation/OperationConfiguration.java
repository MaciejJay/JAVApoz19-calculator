package pl.sda.spring.operation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class OperationConfiguration {

    @Bean
    SubtractionOperation subtractionOperation() {
        return new SubtractionOperation();
    }

    @Bean
    DivisionOperation divisionOperation() {
        return new DivisionOperation("You cannot divide by zero");
    }
}
