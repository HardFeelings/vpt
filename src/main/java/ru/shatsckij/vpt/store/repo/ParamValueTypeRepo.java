package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shatsckij.vpt.store.entity.ParamValueTypeEntity;

public interface ParamValueTypeRepo extends JpaRepository<ParamValueTypeEntity,Long> {
}
