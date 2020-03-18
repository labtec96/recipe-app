package com.example.recipeapp.services;

import com.example.recipeapp.commands.IngredientCommand;

/**
 * Created by ch on 2020-03-10
 */
public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId,Long id);
}
