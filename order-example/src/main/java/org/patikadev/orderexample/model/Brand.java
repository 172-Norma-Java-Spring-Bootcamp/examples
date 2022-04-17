package org.patikadev.orderexample.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Brand extends BaseModel {

    private String name;

}
