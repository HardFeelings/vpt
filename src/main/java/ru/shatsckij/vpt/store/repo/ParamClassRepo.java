package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shatsckij.vpt.store.entity.ParamClassEntity;

import java.util.List;

@Repository
public interface ParamClassRepo extends JpaRepository<ParamClassEntity,Long> {
    List<ParamClassEntity> findAll();
}
