package ru.shatsckij.vpt.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParamClassDto {
    private Long idParamType;
    private String paramClassName;
}
