package kh.edu.istad.platform.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class OrderApplicationService {

    static void main(String[] args) {
        SpringApplication.run(OrderApplicationService.class, args);
    }

}
