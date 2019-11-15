package net.lesno.studyfast.data.models.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.lesno.studyfast.data.models.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Documents extends BaseEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "documentation")
    private String documentation;

}
