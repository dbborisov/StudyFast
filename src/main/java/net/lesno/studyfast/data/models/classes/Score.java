package net.lesno.studyfast.data.models.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.lesno.studyfast.data.models.BaseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "score")
public class Score  extends BaseEntity {

    @ManyToOne(targetEntity = Lessons.class)
    @JoinColumn(name = "lesson_score", referencedColumnName = "name")
    private String name;
    @Column(name = "test_do_on",updatable = false)
    private LocalDateTime testMade;
     @Column(name = "score")
    private Double score;

}
