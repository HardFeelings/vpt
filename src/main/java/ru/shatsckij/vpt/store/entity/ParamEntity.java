package ru.shatsckij.vpt.store.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "param")
public class ParamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_param")
    private Long idParam;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "name_for_print")
    private String nameForPrint;

    @Column(name = "is_printable")
    private Boolean isPrintable;

    @ManyToOne(fetch = FetchType.EAGER)
    private ParamValueTypeEntity paramValueTypeEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    private ParamClassEntity paramClassEntity;
}
