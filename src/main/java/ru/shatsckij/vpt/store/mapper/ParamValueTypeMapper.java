package ru.shatsckij.vpt.store.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.shatsckij.vpt.dto.ParamValueTypeDto;
import ru.shatsckij.vpt.store.entity.ParamValueTypeEntity;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ParamValueTypeMapper {

    ParamValueTypeDto toDTO(ParamValueTypeEntity entity);
    ParamValueTypeEntity toEntity(ParamValueTypeDto dto);
}
