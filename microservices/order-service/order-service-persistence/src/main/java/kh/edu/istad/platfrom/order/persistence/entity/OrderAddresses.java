package kh.edu.istad.platfrom.order.persistence.entity;

import jdk.jfr.StackTrace;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Getter
@StackTrace
@AllArgsConstructor
@Table("order_address")
public class OrderAddresses {

    @Id
    private UUID id;
    private String city;
    private String postalCode;
    private String street;
}
