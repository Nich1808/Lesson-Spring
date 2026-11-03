package kh.edu.istad.platfrom.order.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Table("customers")
public class CustomerEntity {

    @Id
    private UUID id;
    private String familyName;
    private String givenName;
    private String username;
}
