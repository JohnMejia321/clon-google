package com.cursojava.controllers;

import com.cursojava.entities.WebPage;
import com.cursojava.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class SearchController {

    @Autowired
    private SearchService service;

    @GetMapping("api/search")
    public List<WebPage> search(@RequestParam Map<String,String> params){
        String query = params.get("query");
        return service.search(query);
    }
}
