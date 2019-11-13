package net.lesno.studyfast.data.repositories;

import net.lesno.studyfast.data.models.ParentUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentsRepository extends JpaRepository<ParentUser,String> {
}
