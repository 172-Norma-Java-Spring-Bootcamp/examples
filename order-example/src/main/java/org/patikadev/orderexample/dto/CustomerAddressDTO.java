package org.patikadev.orderexample.dto;

public record CustomerAddressDTO(String phoneNumber,
                                 String country,
                                 String city,
                                 String postalCode,
                                 String description) {
}
