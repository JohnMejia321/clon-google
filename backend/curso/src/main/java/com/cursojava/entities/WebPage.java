package com.cursojava.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "webpage")
@Data
public class WebPage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "url")
    private String url;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

}
