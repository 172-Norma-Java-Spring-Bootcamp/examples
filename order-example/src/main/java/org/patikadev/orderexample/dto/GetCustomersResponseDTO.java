package org.patikadev.orderexample.dto;

import org.patikadev.orderexample.model.Gender;

public record GetCustomersResponseDTO(Long id,
                                      String username,
                                      String email,
                                      Gender gender,
                                      CustomerAddressDTO customerAddressDTO) {
}
