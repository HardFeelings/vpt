package ru.shatsckij.vpt.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParamDto {
    private Long idParam;
    private String paramName;
    private String nameForPrint;
    private Boolean isPrintable;
    private ParamValueTypeDto paramValueTypeDto;
    private ParamClassDto paramClassDto;
}
