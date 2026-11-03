package kh.edu.istad.platfrom.order.persistence.repository;

import kh.edu.istad.platform.order.domain.entity.Customer;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface CustomerReactiveRepository extends R2dbcRepository<Customer, UUID> {
}
