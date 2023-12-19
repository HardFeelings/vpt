package ru.shatsckij.vpt.store.mapper;


import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.shatsckij.vpt.dto.ObjDto;
import ru.shatsckij.vpt.store.entity.ObjEntity;

@Mapper(componentModel = "spring", uses = ObjTypeMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ObjMapper {


    @Mapping(source = "entity.objTypeEntity", target = "objTypeDto")
    ObjDto toDTO(ObjEntity entity);

    @Mapping(source = "dto.objTypeDto", target = "objTypeEntity")
    ObjEntity toEntity(ObjDto dto);

}
