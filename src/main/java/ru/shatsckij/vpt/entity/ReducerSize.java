package ru.shatsckij.vpt.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
public class ReducerSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idReducerSize;

    @ManyToOne
    @JoinColumn(name = "id_reducer_series", nullable = true)
    private ReducerSeries reducerSeries;

    @Column
    private String reducerSizeName;
    @Column
    private String nameForPrint;
}
