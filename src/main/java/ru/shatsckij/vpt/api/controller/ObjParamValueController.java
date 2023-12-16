package ru.shatsckij.vpt.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.shatsckij.vpt.api.ObjParamValueApi;
import ru.shatsckij.vpt.dto.ObjParamValueDto;
import ru.shatsckij.vpt.dto.ResponseDto;
import ru.shatsckij.vpt.service.ObjParamValueService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ObjParamValueController implements ObjParamValueApi {


    private final ObjParamValueService objParamValueService;

    @Override
    public ResponseEntity<ResponseDto<List<ObjParamValueDto>>> getAllObjParamValue(){
        return response(objParamValueService.getAllObjParamValue());
    }

    private <Dto> ResponseEntity<ResponseDto<Dto>> response(Dto dto){
        ResponseDto<Dto> response = new ResponseDto<>();
        response.setData(dto);
        response.setError(null);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
