package kh.edu.istad.platfrom.order.persistence.entity;

import java.util.UUID;

public record BusinessEntityId(
        UUID businessId,
        UUID productId
) {
}
