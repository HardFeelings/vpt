package ru.shatsckij.vpt.service;

import org.springframework.stereotype.Service;
import ru.shatsckij.vpt.entity.ReducerSeries;
import ru.shatsckij.vpt.repo.ReducerSeriesRepo;

import java.util.List;

@Service
public class ReducerSeriesServiceImpl implements IReducerSeriesService {

    private final ReducerSeriesRepo reducerSeriesRepo;

    public ReducerSeriesServiceImpl(ReducerSeriesRepo reducerSeriesRepo) {
        this.reducerSeriesRepo = reducerSeriesRepo;
    }

    @Override
    public List<ReducerSeries> getAllReducerSeries() {
        return reducerSeriesRepo.findAll();
    }
}
