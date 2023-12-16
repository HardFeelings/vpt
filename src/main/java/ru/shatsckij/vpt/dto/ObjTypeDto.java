package ru.shatsckij.vpt.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ObjTypeDto {
    private Long idObjType;
    private String fullName;
    private String nameForPrint;
}
