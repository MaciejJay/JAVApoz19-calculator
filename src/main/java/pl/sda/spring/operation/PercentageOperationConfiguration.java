package pl.sda.spring.operation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class PercentageOperationConfiguration {

    @Bean
    PercentageOperation percentageOperation() {
        return new PercentageOperation();
    }
}
