package kh.edu.istad.platfrom.order.persistence.entity;

import java.util.UUID;

public record OrderItemEntityId(
        UUID orderItemId,
        UUID orderId,
        UUID productId
) {
}
