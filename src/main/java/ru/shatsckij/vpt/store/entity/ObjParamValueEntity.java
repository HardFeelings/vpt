package ru.shatsckij.vpt.store.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "obj_param_value")
public class ObjParamValueEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_obj_param_value")
    private Long idObjParamValue;

    @Column(name = "name_for_print")
    private String nameForPrint;

    @Column(name = "value")
    private String value;

    @ManyToOne(fetch = FetchType.EAGER)
    private ObjEntity objEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    private ObjTypeParamEntity objTypeParamEntity;
}
