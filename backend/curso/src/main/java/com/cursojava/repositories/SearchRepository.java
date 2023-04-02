package com.cursojava.repositories;

import com.cursojava.entities.WebPage;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface SearchRepository {

    List<WebPage> search(String textSearch);
}
