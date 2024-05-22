package com.miempresa.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miempresa.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
