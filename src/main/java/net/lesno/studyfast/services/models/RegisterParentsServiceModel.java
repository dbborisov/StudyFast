package net.lesno.studyfast.services.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterParentsServiceModel {


    private String username;
    private String password;
    private String confirmPassword;
    private String firstName;
    private String LastName;
    private String email;
    private int phoneNumber;


}
