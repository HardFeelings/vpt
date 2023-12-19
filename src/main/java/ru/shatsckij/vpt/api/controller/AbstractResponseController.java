package ru.shatsckij.vpt.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ru.shatsckij.vpt.dto.ResponseDto;

public abstract class AbstractResponseController {
    protected <Dto> ResponseEntity<ResponseDto<Dto>> response(Dto dto){
        ResponseDto<Dto> response = new ResponseDto<>();
        response.setData(dto);
        response.setError(null);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
