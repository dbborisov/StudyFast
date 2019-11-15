package net.lesno.studyfast.data.models.usersauth;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.lesno.studyfast.data.models.BaseEntity;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
abstract class BaseUser extends BaseEntity {
    @Column(name = "username",nullable = false, unique = true,updatable = false)
    private String username;
    @Column(name = "password",nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_type")
    private RoleType type;
}
