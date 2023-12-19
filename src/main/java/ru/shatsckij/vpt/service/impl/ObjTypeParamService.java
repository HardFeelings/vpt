package ru.shatsckij.vpt.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.shatsckij.vpt.dto.ObjTypeDto;
import ru.shatsckij.vpt.dto.ObjTypeParamDto;
import ru.shatsckij.vpt.service.IObjTypeParamService;
import ru.shatsckij.vpt.store.entity.ObjTypeParamEntity;
import ru.shatsckij.vpt.store.mapper.ObjTypeMapper;
import ru.shatsckij.vpt.store.mapper.ObjTypeParamMapper;
import ru.shatsckij.vpt.store.repo.ObjTypeParamRepo;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ObjTypeParamService implements IObjTypeParamService {

    private final ObjTypeParamRepo objTypeParamRepo;
    private final ObjTypeParamMapper objTypeParamMapper;

    @Override
    public List<ObjTypeParamDto> getObjTypeParamDtoByObjTypeDto(Long idObjType) {
        List<ObjTypeParamDto> list = new ArrayList<>();
        for(ObjTypeParamEntity item :
            objTypeParamRepo.findObjTypeParamEntitiesByObjTypeEntity_IdObjType(idObjType)){
            list.add(objTypeParamMapper.toDTO(item));
        }

        return list;
    }
}
