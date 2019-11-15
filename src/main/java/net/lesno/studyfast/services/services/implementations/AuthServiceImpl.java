package net.lesno.studyfast.services.services.implementations;

import net.lesno.studyfast.data.models.usersauth.ParentUser;
import net.lesno.studyfast.data.repositories.ParentsRepository;
import net.lesno.studyfast.services.models.LoginParentServiceModel;
import net.lesno.studyfast.services.models.RegisterParentsServiceModel;
import net.lesno.studyfast.services.services.AuthService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final ParentsRepository repository;
    private final ModelMapper modelMapper;

    @Autowired
    public AuthServiceImpl(ParentsRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void register(RegisterParentsServiceModel registerParentsServiceModel) {

        ParentUser parent = this.modelMapper.map(registerParentsServiceModel,ParentUser.class);
        this.repository.save(parent);

    }

    @Override
    public LoginParentServiceModel login(LoginParentServiceModel loginParentServiceModel) {

        return  this.modelMapper.map(this.repository.findByUsernameAndPassword(loginParentServiceModel.getUsername(),loginParentServiceModel.getPassword()),LoginParentServiceModel.class);

    }
}
