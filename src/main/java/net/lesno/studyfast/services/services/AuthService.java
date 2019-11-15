package net.lesno.studyfast.services.services;

import net.lesno.studyfast.services.models.LoginParentServiceModel;
import net.lesno.studyfast.services.models.RegisterParentsServiceModel;

public interface AuthService {

    void register(RegisterParentsServiceModel registerParentsServiceModel);
    LoginParentServiceModel login(LoginParentServiceModel loginParentServiceModel);

}
