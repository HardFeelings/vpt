package ru.shatsckij.vpt.store.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "obj")
public class ObjEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_obj")
    private Long idObj;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "name_for_print")
    private String nameForPrint;

    @Column(name = "price")
    private Double price;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_obj_type")
    private ObjTypeEntity objTypeEntity;

}

