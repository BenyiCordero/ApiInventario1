package com.bcss.apiInventario.service;

import com.bcss.apiInventario.domain.Producto;

import java.util.List;

public interface ProductoService {

    void crearProducto(Producto producto);
    void deleteProducto(Long id);
    void updateProducto(Long id,Producto producto);
    List<Producto> findAllProductos();
    Producto findProductoById(Long id);


}
