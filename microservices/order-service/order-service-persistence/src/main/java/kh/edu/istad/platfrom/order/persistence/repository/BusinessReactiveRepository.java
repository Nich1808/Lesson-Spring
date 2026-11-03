package kh.edu.istad.platfrom.order.persistence.repository;

import kh.edu.istad.platform.order.domain.entity.Business;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface BusinessReactiveRepository extends R2dbcRepository<Business, UUID> {
}
