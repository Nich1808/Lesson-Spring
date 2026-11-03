package kh.edu.istad.platform.order.client.httpClient;


import kh.edu.istad.platform.order.domain.dto.QueryCustomerResult;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import reactor.core.publisher.Flux;

@HttpExchange
public interface BusinessHttpClient {


    @GetExchange("/api/businesses")
    Flux<QueryCustomerResult> getQueryCustomer();
}
