package net.lesno.studyfast.data.models.usersauth;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "parents")
@Getter
@Setter
public class ParentUser  extends BaseUser{

    public ParentUser() {
        this.setType(RoleType.PARENT);
    }
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "first_name",nullable = false,updatable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false,updatable = false)
    private String LastName;
    @Column(name = "phone_number",nullable = false)
    private int phoneNumber; // number can be updated


}
