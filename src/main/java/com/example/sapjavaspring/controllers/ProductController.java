package com.example.sapjavaspring.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Importamos o departamento dentro da pasta entidades para poder usar no método
import com.example.sapjavaspring.entities.Department;
import com.example.sapjavaspring.entities.Product;

//Com essa anotação definimos que o que escrevermos faz parte do método controller
@RestController

//Com essa anotação definimos que estamos definindo um endereço: "localhost:8080/products"
@RequestMapping("/products")
public class ProductController {
    

    //Anotção para definir o método junto com a rota.
    @GetMapping
    //Criação de método existente dentro da rota /produts, ou seja, quando chamarmos a rota /products oque ela retornará vai ser o que estiver descrito a partir daqui.
    public List<Product> getObjects() {
        Department d1 = new Department(1L, "greg");
        Department d2 = new Department(2L, "gregori");

        Product p1 = new Product(1L, "radinho", 2.5, d1);
        Product p2 = new Product(2L, "radinho quebrado", 2.0, d2);
    
        List<Product> list = Arrays.asList(p1, p2);

        return list;
    }
}
