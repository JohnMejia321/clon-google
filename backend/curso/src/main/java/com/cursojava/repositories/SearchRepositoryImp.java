package com.cursojava.repositories;

import com.cursojava.entities.WebPage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SearchRepositoryImp implements SearchRepository {

    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public List<WebPage> search(String textSearch) {
        String query = "FROM WebPage WHERE description like :textSearch";
        return entityManager.createQuery(query)
                .setParameter("textSearch", "%" + textSearch + "%")
                .getResultList();
    }
}
