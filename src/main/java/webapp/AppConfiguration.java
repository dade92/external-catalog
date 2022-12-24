package webapp;

import adapters.KafkaConsumer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public KafkaConsumer kafkaConsumer() {
        return new KafkaConsumer();
    }

}
