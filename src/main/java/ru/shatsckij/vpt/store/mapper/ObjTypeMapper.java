package ru.shatsckij.vpt.store.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.shatsckij.vpt.dto.ObjTypeDto;
import ru.shatsckij.vpt.store.entity.ObjTypeEntity;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ObjTypeMapper {

    ObjTypeDto toDTO(ObjTypeEntity entity);
    ObjTypeEntity toEntity(ObjTypeDto dto);
}
