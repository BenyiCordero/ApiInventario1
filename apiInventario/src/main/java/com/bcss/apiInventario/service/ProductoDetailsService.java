package com.bcss.apiInventario.service;

import com.bcss.apiInventario.domain.ProductoDetails;
import com.bcss.apiInventario.dto.ProductoDetailsDTO;
import com.bcss.apiInventario.dto.ProductoDetailsUpdateDTO;

import java.util.List;

public interface ProductoDetailsService {

    void crearProductoDetails(ProductoDetailsDTO productoDetailsDTO);
    void deleteProductoDetails(Long id);
    void updateProductoDetails(Long id, ProductoDetailsUpdateDTO productoDetailsUpdateDTO);
    List<ProductoDetails> findAllProductoDetails();
    ProductoDetails findProductoDetailsById(Long id);

}
