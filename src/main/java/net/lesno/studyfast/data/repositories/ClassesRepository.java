package net.lesno.studyfast.data.repositories;

import net.lesno.studyfast.data.models.classes.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassesRepository extends JpaRepository<Classes,String> {
    
}
