package kh.edu.istad.platform.order;

import kh.edu.istad.platform.order.config.ServicePropConfig;
import kh.edu.istad.platform.order.domain.dto.QueryCustomerResult;
import kh.edu.istad.platform.order.domain.port.out.client.CustomerServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Map;

@RequiredArgsConstructor
@RefreshScope
@RestController
public class WebFluxController {

    private final CustomerServiceClient customerServiceClient;

//    public WebFluxController(CustomerServiceClient customerServiceClient) {
//        this.customerServiceClient = customerServiceClient;
//    }

    @GetMapping("customers")
    public Flux<QueryCustomerResult> getCustomers(){
        return customerServiceClient.getCustomerNames();
    }


    @GetMapping("/flux")
    public Flux<String> getFluxData() {
        return Flux.just("A", "B", "C", "D", "E", "F")
                .log()
                .delayElements(Duration.ofSeconds(1));
    }

    @Value("${global.version}")
    private String globalVersion;

    private final ServicePropConfig servicePropConfig;

    @GetMapping("/consul/config")
    public Mono<Map<String, Object>> getConsulConfig(){
        return Mono.just(
                Map.of("globalVersion", globalVersion,
                        "message", servicePropConfig.getMessage(),
                        "Env", servicePropConfig.getEnv(),
                        "verion", servicePropConfig.getVersion(),
                        "baseUrl", servicePropConfig.getBaseUrl()
                        )

        );

    }

}
