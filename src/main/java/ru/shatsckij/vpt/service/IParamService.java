package ru.shatsckij.vpt.service;

import ru.shatsckij.vpt.dto.ParamDto;

import java.util.List;

public interface IParamService {
    List<ParamDto> getAllParamByParamClassId(Long idParamClass);
    ParamDto saveParam(ParamDto paramDto);
}
