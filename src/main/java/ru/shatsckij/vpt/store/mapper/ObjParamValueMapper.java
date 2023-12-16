package ru.shatsckij.vpt.store.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.shatsckij.vpt.dto.ObjParamValueDto;
import ru.shatsckij.vpt.store.entity.ObjParamValueEntity;

@Mapper(componentModel = "spring", uses = {ObjMapper.class, ObjTypeParamMapper.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ObjParamValueMapper {

    @Mapping(source = "entity.objEntity", target = "objDto")
    @Mapping(source = "entity.objTypeParamEntity", target = "objTypeParamDto")
    ObjParamValueDto toDTO(ObjParamValueEntity entity);

    @Mapping(source = "dto.objDto", target = "objEntity")
    @Mapping(source = "dto.objTypeParamDto", target = "objTypeParamEntity")
    ObjParamValueEntity toEntity(ObjParamValueDto dto);

}
