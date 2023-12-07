package ru.shatsckij.vpt.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
public class ReducerModification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idReducerModification;

    @Column
    private String nameModification;

    @Column
    private String descModification;

    @ManyToOne
    @JoinColumn(name = "id_reducer_series", nullable = true)
    private ReducerSeries reducerSeries;
    @Column
    private String imgPath;
    @Column
    private String nameForPrint;
}
