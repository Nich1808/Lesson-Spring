package kh.edu.istad.platfrom.order.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Table("order_item")
public class OrderItemEntity {

    @Id
    @Embedded.Nullable
    private OrderItemEntityId orderItemEntityId;
    private BigDecimal price;
    private BigDecimal subTotal;
    private Integer quantity;



}
