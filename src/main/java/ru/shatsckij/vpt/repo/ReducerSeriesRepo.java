package ru.shatsckij.vpt.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shatsckij.vpt.entity.ReducerSeries;

import java.util.List;

@Repository
public interface ReducerSeriesRepo extends CrudRepository<ReducerSeries, Long> {
    List<ReducerSeries> findAll();
}
