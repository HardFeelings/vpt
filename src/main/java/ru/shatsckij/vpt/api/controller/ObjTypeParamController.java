package ru.shatsckij.vpt.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.shatsckij.vpt.api.ObjTypeParamApi;
import ru.shatsckij.vpt.dto.ObjTypeParamDto;
import ru.shatsckij.vpt.dto.ResponseDto;
import ru.shatsckij.vpt.service.impl.ObjTypeParamService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ObjTypeParamController extends AbstractResponseController implements ObjTypeParamApi {

    private final ObjTypeParamService objTypeParamService;
    @Override
    public ResponseEntity<ResponseDto<List<ObjTypeParamDto>>> getObjTypeParamDtoByObjTypeDto(Long idObjType) {
        return response(objTypeParamService.getObjTypeParamDtoByObjTypeDto(idObjType));
    }
}
