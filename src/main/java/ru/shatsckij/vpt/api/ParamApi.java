package ru.shatsckij.vpt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.shatsckij.vpt.dto.ParamDto;
import ru.shatsckij.vpt.dto.ResponseDto;

import java.util.List;

@RequestMapping("api/v1/param")
public interface ParamApi {
    @GetMapping("/paramClass/{idParamClass}")
    ResponseEntity<ResponseDto<List<ParamDto>>> getParamByIdParamClass(@PathVariable Long idParamClass);

    @PostMapping
    ResponseEntity<ResponseDto<ParamDto>> saveParam(@RequestBody ParamDto paramDto);
}
