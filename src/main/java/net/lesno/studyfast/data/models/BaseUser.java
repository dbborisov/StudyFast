package net.lesno.studyfast.data.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.usertype.UserType;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
class BaseUser extends BaseEntity {
    @Column(name = "username",nullable = false, unique = true,updatable = false)
    private String username;
    @Column(name = "password",nullable = false)
    private String password;
    @Column(name = "email",nullable = false)
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(name = "role_type")
    private RoleType type;
}
