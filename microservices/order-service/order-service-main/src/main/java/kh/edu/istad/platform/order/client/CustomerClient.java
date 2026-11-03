package kh.edu.istad.platform.order.client;

import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import reactor.core.publisher.Mono;

@HttpExchange(url = "http://customer-service")
public interface CustomerClient {

    @GetExchange("/api/customers/{id}")
    Mono<JsonNode> getCustomerById(
            @PathVariable("id") String id
    );
}