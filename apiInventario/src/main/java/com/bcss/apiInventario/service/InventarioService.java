package com.bcss.apiInventario.service;

import com.bcss.apiInventario.domain.Inventario;

import java.util.List;

public interface InventarioService {

    void crearInventario(Inventario inventario);
    void deleteInventario(Long id);
    void updateInventario(Long id, Inventario inventario);
    List<Inventario> findAllInventario();
    Inventario findInventarioById(Long id);

}
