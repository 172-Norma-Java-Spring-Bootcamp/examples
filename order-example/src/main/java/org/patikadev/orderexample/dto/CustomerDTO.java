package org.patikadev.orderexample.dto;

import org.patikadev.orderexample.model.Gender;

public record CustomerDTO(String userName, String email, Long identity, Gender gender, String password,
                          CustomerAddressDTO customerAddress) {

}
