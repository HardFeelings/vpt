package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shatsckij.vpt.store.entity.ParamClassEntity;

public interface ParamClassRepo extends JpaRepository<ParamClassEntity,Long> {
}
