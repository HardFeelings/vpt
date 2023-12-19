package ru.shatsckij.vpt.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.shatsckij.vpt.api.ParamClassApi;
import ru.shatsckij.vpt.dto.ParamClassDto;
import ru.shatsckij.vpt.dto.ResponseDto;
import ru.shatsckij.vpt.service.impl.ParamClassService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ParamClassController extends AbstractResponseController implements ParamClassApi {

    private final ParamClassService paramClassService;
    @Override
    public ResponseEntity<ResponseDto<List<ParamClassDto>>> getAllParamClass() {
        return response(paramClassService.getAllParamClass());
    }
}
