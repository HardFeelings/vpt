package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shatsckij.vpt.store.entity.ObjTypeEntity;
import ru.shatsckij.vpt.store.entity.ObjTypeParamEntity;

import java.util.List;
@Repository
public interface ObjTypeParamRepo extends JpaRepository<ObjTypeParamEntity,Long> {
    List<ObjTypeParamEntity> findObjTypeParamEntitiesByObjTypeEntity_IdObjType(Long idObjType);
}
