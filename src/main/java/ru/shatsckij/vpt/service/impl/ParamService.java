package ru.shatsckij.vpt.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.shatsckij.vpt.dto.ParamDto;
import ru.shatsckij.vpt.service.IParamService;
import ru.shatsckij.vpt.store.entity.ParamEntity;
import ru.shatsckij.vpt.store.mapper.ParamMapper;
import ru.shatsckij.vpt.store.repo.ParamRepo;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ParamService implements IParamService {
    private final ParamRepo paramRepo;
    private final ParamMapper paramMapper;
    @Override
    public List<ParamDto> getAllParamByParamClassId(Long idParamClass) {
        List<ParamDto> list = new ArrayList<>();
        for(ParamEntity entity : paramRepo.findAllByParamClassEntity_IdParamClass(idParamClass)) {
            list.add(paramMapper.toDTO(entity));
        }
        return list;
    }

    @Override
    public ParamDto saveParam(ParamDto paramDto) {
        paramRepo.save(paramMapper.toEntity(paramDto));
        ParamDto outParamDto = paramMapper.toDTO(paramRepo.findParamEntityByParamName(paramDto.getParamName()));
        if(outParamDto == null) return null;
        return outParamDto;
    }
}
