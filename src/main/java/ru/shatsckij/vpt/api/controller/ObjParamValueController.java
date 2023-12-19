package ru.shatsckij.vpt.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.shatsckij.vpt.api.ObjParamValueApi;
import ru.shatsckij.vpt.dto.ObjParamValueDto;
import ru.shatsckij.vpt.dto.ResponseDto;
import ru.shatsckij.vpt.service.impl.ObjParamValueService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ObjParamValueController extends AbstractResponseController implements ObjParamValueApi {


    private final ObjParamValueService objParamValueService;

    @Override
    public ResponseEntity<ResponseDto<List<ObjParamValueDto>>> getAllObjParamValue(){
        return response(objParamValueService.getAllObjParamValue());
    }


}
