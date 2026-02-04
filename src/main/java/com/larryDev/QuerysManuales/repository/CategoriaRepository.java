package com.larryDev.QuerysManuales.repository;

import com.larryDev.QuerysManuales.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
