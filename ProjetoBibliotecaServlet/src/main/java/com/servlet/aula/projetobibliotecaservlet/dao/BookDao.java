package com.servlet.aula.projetobibliotecaservlet.dao;
import com.servlet.aula.projetobibliotecaservlet.models.Book;
import jakarta.persistence.EntityManager;
import org.hibernate.PropertyValueException;
import org.hibernate.exception.ConstraintViolationException;

import java.util.List;

import static com.servlet.aula.projetobibliotecaservlet.util.InSessionUtil.getFactory;
import static com.servlet.aula.projetobibliotecaservlet.util.InSessionUtil.inSession;

public class BookDao {
    private EntityManager em;
    List<Book> livros;

    public BookDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Book book){
        inSession(getFactory(), entityManager -> {
                this.em.persist(book);
        });
    }



    public void atualizar(Book book){
        inSession(getFactory(), entityManager -> {
            this.em.merge(book);
        });
    }

    public void remover(Book book){
        inSession(getFactory(), entityManager -> {
            this.em.remove(book);
        });
    }

    public List<Book> listarLivros() {
        inSession(getFactory(), entityManager -> {
            livros = em.createQuery("select b from Book b", Book.class).getResultList();
        });
        return livros;
    }
}
