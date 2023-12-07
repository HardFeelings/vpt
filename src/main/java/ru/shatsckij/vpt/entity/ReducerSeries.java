package ru.shatsckij.vpt.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
public class ReducerSeries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idReducerSeries;

    @Column
    private String seriesName;

    @Column
    private String imgPath;
    @Column
    private String nameForPrint;
}
