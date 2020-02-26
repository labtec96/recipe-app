package com.example.recipeapp.repositories;

import com.example.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ch on 2020-02-26
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
