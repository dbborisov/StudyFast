package net.lesno.studyfast.data.models.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.lesno.studyfast.data.models.BaseEntity;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "exams")
public class Exams extends BaseEntity {
    @Column(name = "test_number",nullable = false)
    private int testNumber;

    @ManyToOne(targetEntity = Lessons.class)
    @JoinColumn(name = "lesson_name", referencedColumnName = "name")
    private String testName;

}
