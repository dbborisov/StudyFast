package net.lesno.studyfast.data.models.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.lesno.studyfast.data.models.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "lessons")
public class Lessons extends BaseEntity {

    @Column(name = "name",nullable = false, unique = true)
    private String name;

    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "is_done", nullable = false)
    private boolean isDone;
    @Column(name = "time_for_complete")
    private String timeForComplete;

    @OneToMany(mappedBy = "id", targetEntity = Documents.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Documents> documentsList;


    @OneToMany(mappedBy = "id", targetEntity = Exams.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Exams> examsList;

    @Column(name = "exam_score")
    private Double examScore;

}
