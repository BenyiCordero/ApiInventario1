package com.bcss.apiInventario.controller;

import com.bcss.apiInventario.dto.testDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/test")
public class testController {

    @GetMapping
    public ResponseEntity<?> testController(@RequestBody testDTO dto) {
        return ResponseEntity.ok().body(dto.mensaje());
    }

}
