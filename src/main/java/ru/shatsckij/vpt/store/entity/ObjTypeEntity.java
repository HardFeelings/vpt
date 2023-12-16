package ru.shatsckij.vpt.store.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "obj_type")
public class ObjTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_obj_type")
    private Long idObjType;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "name_for_print")
    private String nameForPrint;

}
