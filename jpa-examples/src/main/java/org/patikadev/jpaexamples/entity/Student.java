package org.patikadev.jpaexamples.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Entity
public class Student extends BaseExtendedEntity {

    // 1 - NoArgsConstructor olmak zorunda..
    // 2 - @Id anotasyonun kullanılıyor olması lazım.
    // 3-  Defaullta get - setter olmalı..

    @Setter
    private Long number;

    @Setter
    @Column(length = 50)
    private String name;

    @Setter
    @Column(length = 60)
    private String lastName;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private DepartmentEnum department;

    @Setter
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @OneToOne(optional = false)
    private StudentAddress studentAddress;

    @ManyToMany
    private Set<Course> courses = new HashSet<>();


    public void addStudentAddress(StudentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }


}
