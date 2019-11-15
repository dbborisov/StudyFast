package net.lesno.studyfast.data.models.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.lesno.studyfast.data.models.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classes")
@Getter
@Setter
@NoArgsConstructor
public class Classes extends BaseEntity {

    @Column(name = "class_name",nullable = false, unique = true)
    private String className;

    @OneToMany(mappedBy = "id", targetEntity = Lessons.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Lessons> lessons;

    @OneToMany(mappedBy = "id", targetEntity = Score.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Score> scores;
}
