package com.bcss.apiInventario.controller;

import com.bcss.apiInventario.dto.ProductoDetailsDTO;
import com.bcss.apiInventario.dto.ProductoDetailsUpdateDTO;
import com.bcss.apiInventario.service.ProductoDetailsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/productoDetails")
public class ProductoDetailsController {

    private final ProductoDetailsService productoDetailsService;


    public ProductoDetailsController(ProductoDetailsService productoDetailsService) {
        this.productoDetailsService = productoDetailsService;
    }

    @PostMapping
    public ResponseEntity<?> crearProductoDetails(@RequestBody ProductoDetailsDTO productoDetailsDTO) {
        productoDetailsService.crearProductoDetails(productoDetailsDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> deleteProductoDetails (@PathVariable Long id) {
        productoDetailsService.deleteProductoDetails(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping ("/{id}")
    public ResponseEntity<?> updateProductoDetails(@PathVariable Long id , @RequestBody ProductoDetailsUpdateDTO productoDetailsUpdateDTO) {
        productoDetailsService.updateProductoDetails(id, productoDetailsUpdateDTO);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping
    public ResponseEntity<?> findAllProductoDetails() {
        return ResponseEntity.status(HttpStatus.OK).body(productoDetailsService.findAllProductoDetails());
    }

    @GetMapping ("/{id}")
    public ResponseEntity<?> findProductoDetailsById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(productoDetailsService.findProductoDetailsById(id));
    }

}
