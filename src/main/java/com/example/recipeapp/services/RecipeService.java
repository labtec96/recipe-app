package com.example.recipeapp.services;

import com.example.recipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by ch on 2020-02-26
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
