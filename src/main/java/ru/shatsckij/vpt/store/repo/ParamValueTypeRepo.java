package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shatsckij.vpt.store.entity.ParamValueTypeEntity;

import java.util.List;

@Repository
public interface ParamValueTypeRepo extends JpaRepository<ParamValueTypeEntity,Long> {
    List<ParamValueTypeEntity> findAll();
}
