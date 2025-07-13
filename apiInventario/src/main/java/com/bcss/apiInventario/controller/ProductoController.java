package com.bcss.apiInventario.controller;

import com.bcss.apiInventario.domain.Producto;
import com.bcss.apiInventario.service.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/producto")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping
    public ResponseEntity<?> crearProducto(@RequestBody Producto producto){
        productoService.crearProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping( "/{id}")
    public ResponseEntity<?> deleteProducto(@PathVariable Long id){
        productoService.deleteProducto(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


    @PutMapping ("/{id}")
    public ResponseEntity<?> updateProducto(@PathVariable Long id, @RequestBody Producto producto){
        productoService.updateProducto(id, producto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping
    public ResponseEntity<?> findAllProductos(){
        return ResponseEntity.status(HttpStatus.OK).body(productoService.findAllProductos());
    }

    @GetMapping ("/{id}")
    public ResponseEntity<?> findProductoById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(productoService.findProductoById(id));
    }


}
