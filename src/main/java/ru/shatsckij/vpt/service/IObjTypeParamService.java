package ru.shatsckij.vpt.service;

import ru.shatsckij.vpt.dto.ObjTypeDto;
import ru.shatsckij.vpt.dto.ObjTypeParamDto;

import java.util.List;

public interface IObjTypeParamService {
    List<ObjTypeParamDto> getObjTypeParamDtoByObjTypeDto(Long idObjType);
}
