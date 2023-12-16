package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shatsckij.vpt.store.entity.ObjTypeEntity;

public interface ObjTypeRepo extends JpaRepository<ObjTypeEntity,Long> {
}
