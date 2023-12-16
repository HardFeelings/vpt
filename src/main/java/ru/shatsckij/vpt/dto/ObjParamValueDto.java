package ru.shatsckij.vpt.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ObjParamValueDto {
    private Long idObjParamValue;

    private String nameForPrint;

    private String value;

    private ObjDto objDto;

    private ObjTypeParamDto objTypeParamDto;
}
