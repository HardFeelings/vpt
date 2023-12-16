package ru.shatsckij.vpt.store.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import ru.shatsckij.vpt.dto.ObjTypeDto;
import ru.shatsckij.vpt.store.entity.ObjTypeEntity;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ObjTypeMapper {
    //@Mapping(source = "entity.objTypeParamEntities", target = "objTypeParamDtos")
    ObjTypeDto toDTO(ObjTypeEntity entity);
    //@Mapping(source = "dto.objTypeParamDtos", target = "objTypeParamEntities")
    ObjTypeEntity toEntity(ObjTypeDto dto);
}
