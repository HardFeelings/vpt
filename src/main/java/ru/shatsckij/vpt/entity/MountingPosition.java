package ru.shatsckij.vpt.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
public class MountingPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idMountingPosition;

    @ManyToOne
    @JoinColumn(name = "id_reducer_series", nullable = true)
    private ReducerSeries reducerSeries;

    @Column
    private String nameMountingPosition;

    @Column
    private String fullNameMountingPosition;
}
