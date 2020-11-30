package com.duoc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duoc.api.modelo.Producto;

public interface IORepositoryProducto  extends JpaRepository<Producto, Integer>{

}
