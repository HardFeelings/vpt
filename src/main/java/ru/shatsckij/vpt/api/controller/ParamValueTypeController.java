package ru.shatsckij.vpt.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.shatsckij.vpt.api.ParamValueTypeApi;
import ru.shatsckij.vpt.dto.ParamValueTypeDto;
import ru.shatsckij.vpt.dto.ResponseDto;
import ru.shatsckij.vpt.service.impl.ParamValueTypeService;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ParamValueTypeController extends AbstractResponseController implements ParamValueTypeApi {

    private final ParamValueTypeService paramValueTypeService;
    @Override
    public ResponseEntity<ResponseDto<List<ParamValueTypeDto>>> getAllParamValueType() {
        return response(paramValueTypeService.getAllParamValueTypeDto());
    }
}
