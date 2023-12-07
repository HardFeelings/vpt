package ru.shatsckij.vpt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.shatsckij.vpt.dto.ResponseDto;
import ru.shatsckij.vpt.entity.ReducerSeries;

import java.util.List;

@RequestMapping("api/v1/reducerSeries")
public interface ReducerSeriesApi {

    @GetMapping
    ResponseEntity<ResponseDto<List<ReducerSeries>>> getAllReducerSeries();
}
