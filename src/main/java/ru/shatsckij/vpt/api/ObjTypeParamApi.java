package ru.shatsckij.vpt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.shatsckij.vpt.dto.ObjParamValueDto;
import ru.shatsckij.vpt.dto.ObjTypeDto;
import ru.shatsckij.vpt.dto.ObjTypeParamDto;
import ru.shatsckij.vpt.dto.ResponseDto;

import java.util.List;

@RequestMapping("api/v1/objTypeParam")
public interface ObjTypeParamApi {

    @GetMapping("/{idObjType}")
    ResponseEntity<ResponseDto<List<ObjTypeParamDto>>> getObjTypeParamDtoByObjTypeDto(@PathVariable("idObjType") Long idObjType);
}
