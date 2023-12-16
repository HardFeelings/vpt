package ru.shatsckij.vpt.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ObjTypeParamDto {
    private Long idObjTypeParam;
    private ParamDto paramDto;
    private ObjTypeDto objTypeDto;
}
