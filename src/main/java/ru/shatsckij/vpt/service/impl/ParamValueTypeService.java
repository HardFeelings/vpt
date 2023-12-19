package ru.shatsckij.vpt.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.shatsckij.vpt.dto.ParamValueTypeDto;
import ru.shatsckij.vpt.service.IParamValueTypeService;
import ru.shatsckij.vpt.store.entity.ParamValueTypeEntity;
import ru.shatsckij.vpt.store.mapper.ParamValueTypeMapper;
import ru.shatsckij.vpt.store.repo.ParamValueTypeRepo;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ParamValueTypeService implements IParamValueTypeService {

    private final ParamValueTypeRepo paramValueTypeRepo;
    private final ParamValueTypeMapper paramValueTypeMapper;
    @Override
    public List<ParamValueTypeDto> getAllParamValueTypeDto() {
        List<ParamValueTypeDto> list = new ArrayList<>();
        for(ParamValueTypeEntity entity : paramValueTypeRepo.findAll()){
            list.add(paramValueTypeMapper.toDTO(entity));
        }
        return list;
    }
}
