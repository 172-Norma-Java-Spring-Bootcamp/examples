package org.patikadev.orderexample.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Customer extends BaseExtendedModel {

    private String username;
    private String email;
    private Long identity;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String password;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private CustomerAddress customerAddress;

}
