package ru.shatsckij.vpt.store.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "param_value_type")
public class ParamValueTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_param_value_type")
    private Long idParamValueType;

    @Column(name = "value_type_name")
    private String valueTypeName;
}
