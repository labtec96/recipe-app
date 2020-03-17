package com.example.recipeapp.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by ch on 2020-02-26
 */

@Getter
@Setter
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}
