package com.bcss.apiInventario.repository;

import com.bcss.apiInventario.domain.ProductoDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDetailsRepository extends JpaRepository<ProductoDetails, Long> {
}
