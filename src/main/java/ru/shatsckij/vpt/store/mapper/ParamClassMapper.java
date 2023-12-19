package ru.shatsckij.vpt.store.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.shatsckij.vpt.dto.ParamClassDto;
import ru.shatsckij.vpt.store.entity.ParamClassEntity;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ParamClassMapper {

    ParamClassDto toDTO(ParamClassEntity entity);
    ParamClassEntity toEntity(ParamClassDto dto);
}
