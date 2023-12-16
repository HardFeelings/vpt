package ru.shatsckij.vpt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.shatsckij.vpt.dto.ObjParamValueDto;
import ru.shatsckij.vpt.dto.ResponseDto;

import java.util.List;

@RequestMapping("api/v1/objParamValue")
public interface ObjParamValueApi {

    @GetMapping
    ResponseEntity<ResponseDto<List<ObjParamValueDto>>> getAllObjParamValue();
}
