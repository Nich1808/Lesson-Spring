package kh.edu.istad.platform.customer.restapi.mapper;

import kh.edu.istad.common.domain.valueobject.CustomerId;
import kh.edu.istad.platform.customer.domain.dto.InitiateCustomerCommand;
import kh.edu.istad.platform.customer.domain.entity.Customer;
import kh.edu.istad.platform.customer.domain.valueobject.CustomerStatus;
import kh.edu.istad.platform.customer.domain.valueobject.Email;
import kh.edu.istad.platform.customer.domain.valueobject.PhoneNumber;
import kh.edu.istad.platform.customer.restapi.dto.CreateCustomerRequest;
import kh.edu.istad.platform.customer.restapi.dto.CustomerInitiateRequest;
import kh.edu.istad.platform.customer.restapi.dto.CustomerInitiateResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface CustomerWebMapper {

    InitiateCustomerCommand toCommand(CustomerInitiateRequest request);

    @Mapping(target = "customerId", source = "id")
    CustomerInitiateResponse toResponse(Customer customer);

    Customer toDomain(CreateCustomerRequest request);

    // String -> Email
    default Email map(String email) {
        return email == null ? null : new Email(email);
    }

    // Email -> String
    default String map(Email email) {
        return email == null ? null : email.value();
    }

    // String -> PhoneNumber
    default PhoneNumber mapPhone(String phoneNumber) {
        return phoneNumber == null ? null : new PhoneNumber(phoneNumber);
    }

    // PhoneNumber -> String
    default String map(PhoneNumber phoneNumber) {
        return phoneNumber == null ? null : phoneNumber.value();
    }

    // CustomerId -> UUID
    default UUID map(CustomerId id) {
        return id == null ? null : id.value();
    }

    // CustomerStatus -> String
    default String map(CustomerStatus status) {
        return status == null ? null : status.name();
    }
}
