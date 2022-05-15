package org.patikadev.springsecurityjwtapi.entity;

import lombok.Getter;
import lombok.Setter;
import org.patikadev.springsecurityjwtapi.entity.enums.UserStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserStatus userStatus = UserStatus.ACTIVE;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date lastSuccessfullyLoggedInTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date lastFailureLoggedInTime;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();


    public void addRoles(Set<Role> roles) {
        roles.forEach(role -> role.setUser(this));
        this.roles.addAll(roles);
    }

    public void removeRoles(Set<Role> roles) {
        roles.forEach(role -> role.setUser(null));
        this.roles.removeAll(roles);
    }

    public void lockUser() {
        this.userStatus = UserStatus.LOCKED;
    }
}
