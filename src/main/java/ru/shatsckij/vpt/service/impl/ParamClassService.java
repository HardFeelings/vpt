package ru.shatsckij.vpt.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.shatsckij.vpt.dto.ParamClassDto;
import ru.shatsckij.vpt.service.IParamClassService;
import ru.shatsckij.vpt.store.entity.ParamClassEntity;
import ru.shatsckij.vpt.store.mapper.ParamClassMapper;
import ru.shatsckij.vpt.store.repo.ParamClassRepo;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ParamClassService implements IParamClassService {

    private final ParamClassRepo paramClassRepo;
    private final ParamClassMapper paramClassMapper;
    @Override
    public List<ParamClassDto> getAllParamClass() {
        List<ParamClassDto> list = new ArrayList<>();
        for(ParamClassEntity entity: paramClassRepo.findAll()){
            list.add(paramClassMapper.toDTO(entity));
        }
        return list;
    }
}
