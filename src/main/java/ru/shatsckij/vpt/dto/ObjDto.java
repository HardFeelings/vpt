package ru.shatsckij.vpt.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ObjDto {
    private Long idObj;
    private String fullName;
    private String nameForPrint;
    private Double price;
    private ObjTypeDto objTypeDto;
}
