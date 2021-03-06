package com.example.recipeapp.domain;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    static Category category;

    @BeforeAll
    public static void setUp(){
        category = new Category();
    }

    @Test
    void getId() {
        Long idValue = 4l;

        category.setId(idValue);

        assertEquals(idValue,category.getId());
    }

    @Test
    void getDescription() {
        String descriptionValue = "Hehe";

        category.setDescription("Hehe");

        assertEquals(descriptionValue, category.getDescription());
    }

    @Test
    void getRecipes() {
    }
}