package ru.shatsckij.vpt.store.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "obj_type_param")
public class ObjTypeParamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_obj_type_param")
    private Long idObjTypeParam;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_param")
    private ParamEntity paramEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "obj_type")
    private ObjTypeEntity objTypeEntity;
}
