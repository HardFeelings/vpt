package ru.shatsckij.vpt.store.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.shatsckij.vpt.dto.ParamDto;
import ru.shatsckij.vpt.store.entity.ParamEntity;

@Mapper(componentModel = "spring", uses = {ParamValueTypeMapper.class, ParamClassMapper.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ParamMapper {
   //@Mapping(source = "entity.objTypeParamEntities", target = "objTypeParamDtos")
    @Mapping(source = "entity.paramValueTypeEntity", target = "paramValueTypeDto")
    @Mapping(source = "entity.paramClassEntity", target = "paramClassDto")
    ParamDto toDTO(ParamEntity entity);

   // @Mapping(source = "dto.objTypeParamDtos", target = "objTypeParamEntities")
    @Mapping(source = "dto.paramValueTypeDto", target = "paramValueTypeEntity")
    @Mapping(source = "dto.paramClassDto", target = "paramClassEntity")
    ParamEntity toEntity(ParamDto dto);


}
