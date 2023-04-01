package com.cursojava.controllers;

import com.cursojava.entities.WebPage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    @GetMapping("api/search")
    public List<WebPage> search(){
        List<WebPage> result= new ArrayList<>();
        return result;
    }
}
