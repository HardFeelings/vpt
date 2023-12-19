package ru.shatsckij.vpt.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.shatsckij.vpt.dto.ObjParamValueDto;

import ru.shatsckij.vpt.service.IObjParamValueService;
import ru.shatsckij.vpt.store.entity.ObjParamValueEntity;
import ru.shatsckij.vpt.store.mapper.ObjParamValueMapper;
import ru.shatsckij.vpt.store.repo.ObjParamValueRepo;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ObjParamValueService implements IObjParamValueService {

    private final ObjParamValueRepo objParamValueRepo;
    private final ObjParamValueMapper objParamValueMapper;
    @Override
    public List<ObjParamValueDto> getAllObjParamValue() {
        List<ObjParamValueDto> objParamValueDtos = new ArrayList<>();
        for(ObjParamValueEntity entity: objParamValueRepo.findAll()){
            objParamValueDtos.add(objParamValueMapper.toDTO(entity));
        }
        return objParamValueDtos;
    }
}
