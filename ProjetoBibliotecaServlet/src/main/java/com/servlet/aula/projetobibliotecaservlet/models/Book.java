package com.servlet.aula.projetobibliotecaservlet.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int isbn;
    private String titulo;
    private String categoria;
    private int quantidade;


    public Book(int isbn, String titulo, String categoria, int quantidade) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }
}



