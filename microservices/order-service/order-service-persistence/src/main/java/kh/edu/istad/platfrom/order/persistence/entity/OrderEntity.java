package kh.edu.istad.platfrom.order.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@Table("orders")
public class OrderEntity {

    @Id
    private UUID id;
    private UUID businessId;
    private UUID customerId;
    private String failureMessages;
    private String status;
    private BigDecimal price;
    private UUID trackingId;
    private UUID order_address_id;
}
