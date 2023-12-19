package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shatsckij.vpt.store.entity.ObjEntity;
@Repository
public interface ObjRepo extends JpaRepository<ObjEntity,Long> {
}
