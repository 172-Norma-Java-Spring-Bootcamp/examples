package org.patikadev.jpaexamples.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;


@Entity
@Getter
@Setter
public class Course extends BaseEntity {

    private String name;
    private String code;
}
