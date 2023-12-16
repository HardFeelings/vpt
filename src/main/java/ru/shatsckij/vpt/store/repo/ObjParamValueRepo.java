package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shatsckij.vpt.store.entity.ObjParamValueEntity;

import java.util.List;

@Repository
public interface ObjParamValueRepo extends JpaRepository<ObjParamValueEntity, Long> {
    public List<ObjParamValueEntity> findAll();
}
