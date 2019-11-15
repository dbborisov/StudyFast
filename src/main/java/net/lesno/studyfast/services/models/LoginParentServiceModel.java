package net.lesno.studyfast.services.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginParentServiceModel {
    private String id;
    private String username;
    private String password;
}
