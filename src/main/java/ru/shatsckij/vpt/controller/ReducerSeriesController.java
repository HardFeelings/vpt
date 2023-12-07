package ru.shatsckij.vpt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shatsckij.vpt.api.ReducerSeriesApi;
import ru.shatsckij.vpt.dto.ResponseDto;
import ru.shatsckij.vpt.entity.ReducerSeries;
import ru.shatsckij.vpt.service.IReducerSeriesService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReducerSeriesController implements ReducerSeriesApi {

    private final IReducerSeriesService reducerSeriesService;

    @Override
    public ResponseEntity<ResponseDto<List<ReducerSeries>>> getAllReducerSeries(){
        return response(reducerSeriesService.getAllReducerSeries());
    }

    private <Dto> ResponseEntity<ResponseDto<Dto>> response(Dto dto){
        ResponseDto<Dto> response = new ResponseDto<>();
        response.setData(dto);
        response.setError(null);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
