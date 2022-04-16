package org.patikadev.jpaexamples.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class StudentAddress extends BaseEntity {

    private String country;
    private String city;
    private String district;
    private String description;

}
