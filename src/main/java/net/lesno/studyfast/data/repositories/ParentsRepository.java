package net.lesno.studyfast.data.repositories;

import net.lesno.studyfast.data.models.usersauth.ParentUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParentsRepository extends JpaRepository<ParentUser,String> {
    boolean existsByUsername(String username);
    Optional<ParentUser> findByUsernameAndPassword(String username, String password);

}
