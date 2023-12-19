package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shatsckij.vpt.store.entity.ObjTypeEntity;
@Repository
public interface ObjTypeRepo extends JpaRepository<ObjTypeEntity,Long> {
}
