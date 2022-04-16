package org.patikadev.jpaexamples.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Getter
@Setter
public class BaseExtendedEntity extends BaseEntity {

    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
    @Temporal(TemporalType.DATE)
    private Date deletedAt;

    private String createdBy;
    private String updatedBy;
    private String deletedBy;
}
