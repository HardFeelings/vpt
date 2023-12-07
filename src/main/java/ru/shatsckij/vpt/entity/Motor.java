package ru.shatsckij.vpt.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
public class Motor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idMotor;
    @Column
    private String nameMotor;
    @Column
    private String nameForPrint;
    @Column
    private Long power;
    @Column
    private String terminalBoxDirection;
    @Column
    private Boolean isMotorFan;
    @Column
    private Boolean isBreak;
    @Column
    private Long numberOfPoles;
    @Column
    private Long rpm;
}
