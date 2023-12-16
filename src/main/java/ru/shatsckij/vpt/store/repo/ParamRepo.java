package ru.shatsckij.vpt.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shatsckij.vpt.store.entity.ParamEntity;

public interface ParamRepo extends JpaRepository<ParamEntity,Long> {
}
