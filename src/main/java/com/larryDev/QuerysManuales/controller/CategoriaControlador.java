package com.larryDev.QuerysManuales.controller;

import com.larryDev.QuerysManuales.model.Categoria;
import com.larryDev.QuerysManuales.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Scanner;

@Controller
public class CategoriaControlador implements CommandLineRunner {
    Scanner scan = new Scanner(System.in);
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/")
    public String inicio(Model modelo){
        modelo.addAttribute("categorias",categoriaService.listarTodasLasCategorias());
        return "index";

    }

    @Override
    public void run(String... args) throws Exception {
        //categoriaService.mostrarDatosPorDosTiposDeNombre().stream().forEach(System.out::println);
    }
}
