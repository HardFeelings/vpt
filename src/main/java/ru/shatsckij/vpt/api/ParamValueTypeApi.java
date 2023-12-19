package ru.shatsckij.vpt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.shatsckij.vpt.dto.ObjTypeParamDto;
import ru.shatsckij.vpt.dto.ParamValueTypeDto;
import ru.shatsckij.vpt.dto.ResponseDto;

import java.util.List;

@RequestMapping("api/v1/paramValueType")
public interface ParamValueTypeApi {
    @GetMapping
    ResponseEntity<ResponseDto<List<ParamValueTypeDto>>> getAllParamValueType();
}
