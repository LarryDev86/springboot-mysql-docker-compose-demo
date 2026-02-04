package com.larryDev.QuerysManuales.service;

import com.larryDev.QuerysManuales.model.Categoria;
import com.larryDev.QuerysManuales.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void añadirNuevaCategoria(Categoria cat){
        categoriaRepository.save(cat);
        System.out.println("Categoria añadida a la base de datos.");
    }

    public List<Categoria> listarTodasLasCategorias(){
        return categoriaRepository.findAll();
    }

}
