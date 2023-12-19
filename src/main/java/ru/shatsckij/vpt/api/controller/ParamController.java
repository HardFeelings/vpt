package ru.shatsckij.vpt.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.shatsckij.vpt.api.ParamApi;
import ru.shatsckij.vpt.dto.ParamDto;
import ru.shatsckij.vpt.dto.ResponseDto;
import ru.shatsckij.vpt.service.impl.ParamService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ParamController extends AbstractResponseController implements ParamApi {
    private final ParamService paramService;
    @Override
    public ResponseEntity<ResponseDto<List<ParamDto>>> getParamByIdParamClass(Long idParamClass) {
        return response(paramService.getAllParamByParamClassId(idParamClass));
    }

    @Override
    public ResponseEntity<ResponseDto<ParamDto>> saveParam(ParamDto paramDto) {
        return response(paramService.saveParam(paramDto));
    }


}
