package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shatsckij.vpt.store.entity.ObjEntity;

public interface ObjRepo extends JpaRepository<ObjEntity,Long> {
}
