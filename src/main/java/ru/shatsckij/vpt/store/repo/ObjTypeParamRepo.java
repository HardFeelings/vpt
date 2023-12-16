package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shatsckij.vpt.store.entity.ObjTypeParamEntity;

public interface ObjTypeParamRepo extends JpaRepository<ObjTypeParamEntity,Long> {
}
