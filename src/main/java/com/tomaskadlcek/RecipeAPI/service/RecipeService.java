package com.tomaskadlcek.RecipeAPI.service;

import com.tomaskadlcek.RecipeAPI.shared.DTO.RecipeDTO;

public interface RecipeService {
    RecipeDTO getRecipeById(Integer id);
}
