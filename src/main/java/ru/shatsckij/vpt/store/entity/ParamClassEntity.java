package ru.shatsckij.vpt.store.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "param_class")
public class ParamClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_param_class")
    private Long idParamClass;

    @Column(name = "param_class_name")
    private String paramClassName;
}
