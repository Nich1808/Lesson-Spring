package kh.edu.istad.platfrom.order.persistence.repository;

import kh.edu.istad.platform.order.domain.entity.Order;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface OrderReactiveRepository extends R2dbcRepository<Order, UUID> {
}
