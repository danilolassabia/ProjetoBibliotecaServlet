package com.servlet.aula.projetobibliotecaservlet.dao;
import com.servlet.aula.projetobibliotecaservlet.models.Logger;
import jakarta.persistence.EntityManager;


import static com.servlet.aula.projetobibliotecaservlet.util.InSessionUtil.getFactory;
import static com.servlet.aula.projetobibliotecaservlet.util.InSessionUtil.inSession;

public class LoggerDao {

    private EntityManager em;

    public LoggerDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Logger logger){
        inSession(getFactory(), entityManager -> {
            this.em.persist(logger);
        });
    }

//    public void atualizar(Logger logger){
//        this.em.merge(logger);
//    }
//
//    public void remover(Logger logger){
//        logger = em.merge(logger);
//        this.em.remove(logger);
//    }
}
