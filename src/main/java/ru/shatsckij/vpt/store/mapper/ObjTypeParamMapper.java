package ru.shatsckij.vpt.store.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.shatsckij.vpt.dto.ObjTypeParamDto;
import ru.shatsckij.vpt.store.entity.ObjTypeParamEntity;

@Mapper(componentModel = "spring", uses = {ParamMapper.class, ObjTypeMapper.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ObjTypeParamMapper {

    @Mapping(source = "entity.paramEntity", target = "paramDto")
    @Mapping(source = "entity.objTypeEntity", target = "objTypeDto")
    ObjTypeParamDto toDTO(ObjTypeParamEntity entity);
    @Mapping(source = "dto.paramDto", target = "paramEntity")
    @Mapping(source = "dto.objTypeDto", target = "objTypeEntity")
    ObjTypeParamEntity toEntity(ObjTypeParamDto dto);

}
