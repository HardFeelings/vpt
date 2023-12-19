package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shatsckij.vpt.store.entity.ParamEntity;

import java.util.List;

@Repository
public interface ParamRepo extends JpaRepository<ParamEntity,Long> {
    List<ParamEntity> findAllByParamClassEntity_IdParamClass(Long idParamClass);
    ParamEntity findParamEntityByParamName(String paramName);
}
