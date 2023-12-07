package ru.shatsckij.vpt.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
public class MotorReducer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idMotorReducer;

    @Column
    private String nameForPrint;

    @ManyToOne
    @JoinColumn(name = "id_reducer", nullable = true)
    private Reducer reducer;

    @ManyToOne
    @JoinColumn(name = "id_motor", nullable = true)
    private Motor motor;

    @Column
    private Double price;

    @Column
    private Long rpm;

}
