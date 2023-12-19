package ru.shatsckij.vpt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.shatsckij.vpt.dto.ObjTypeParamDto;
import ru.shatsckij.vpt.dto.ParamClassDto;
import ru.shatsckij.vpt.dto.ResponseDto;

import java.util.List;

@RequestMapping("api/v1/paramClass")
public interface ParamClassApi {
    @GetMapping
    ResponseEntity<ResponseDto<List<ParamClassDto>>> getAllParamClass();
}
