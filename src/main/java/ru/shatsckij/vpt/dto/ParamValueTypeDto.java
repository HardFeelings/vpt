package ru.shatsckij.vpt.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParamValueTypeDto {
    private Long idParamValueType;
    private String valueTypeName;
}
