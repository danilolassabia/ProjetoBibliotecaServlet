package com.servlet.aula.projetobibliotecaservlet.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Logger")
public class Logger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String password;

    public Logger(String nome, String email, String password) {
        this.nome = nome;
        this.email = email;
        this.password = password;
    }
}
