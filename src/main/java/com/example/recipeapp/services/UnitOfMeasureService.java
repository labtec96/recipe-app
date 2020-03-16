package com.example.recipeapp.services;

import com.example.recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by ch on 2020-03-16
 */
public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
