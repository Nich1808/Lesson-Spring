package kh.edu.istad.platform.order.persistence.entity;


import kh.edu.istad.platfrom.order.persistence.entity.BusinessEntityId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Table("businesses")
public class BusinessEntity {

    @Id
    @Embedded.Nullable
    private BusinessEntityId businessEntityId;

    @Column("business_active")
    private Boolean businessActive;

    @Column("product_name")
    private String productName;

    @Column("product_price")
    private BigDecimal productPrice;

}
