package ru.shatsckij.vpt.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
public class Reducer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idReducer;

    @ManyToOne
    @JoinColumn(name = "id_reducer_series", nullable = true)
    private ReducerSeries reducerSeries;

    @ManyToOne
    @JoinColumn(name = "id_reducer_size", nullable = true)
    private ReducerSize reducerSize;

    @ManyToOne
    @JoinColumn(name = "id_reducer_modification", nullable = true)
    private ReducerModification reducerModification;

    @ManyToOne
    @JoinColumn(name = "id_mounting_position", nullable = true)
    private MountingPosition mountingPosition;

    @Column
    private String imgPath;

    @Column
    private Double gearRatio;

    @Column
    private Long diameterShaft;

    @Column
    private Boolean isBackStop;

    @Column
    private String nameForPrint;
}
