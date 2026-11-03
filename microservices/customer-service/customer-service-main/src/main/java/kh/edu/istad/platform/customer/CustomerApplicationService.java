package kh.edu.istad.platform.customer;

import kh.edu.istad.common.swagger.config.OpenApiConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import(OpenApiConfig.class)
public class CustomerApplicationService {

    static void main(String[] args) {
        SpringApplication.run(CustomerApplicationService.class, args);
    }
}
