package com.example.recipeapp.controllers;

import com.example.recipeapp.domain.Recipe;
import com.example.recipeapp.services.RecipeService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class RecipeControllerTest {


        @Mock
        RecipeService recipeService;

        RecipeController controller;

        @BeforeEach
        void setUp() throws Exception {
            MockitoAnnotations.initMocks(this);

            controller = new RecipeController(recipeService);
        }

        @Test
        void testGetRecipe() throws Exception {

            Recipe recipe = new Recipe();
            recipe.setId(1L);

            MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

            when(recipeService.findById(anyLong())).thenReturn(recipe);

            mockMvc.perform(get("/recipe/show/1"))
                    .andExpect(status().isOk());
        }
}