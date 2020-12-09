package com.tomaskadlcek.RecipeAPI.controller;

import com.tomaskadlcek.RecipeAPI.io.responsemodels.RecipeResponse;
import com.tomaskadlcek.RecipeAPI.service.RecipeService;
import com.tomaskadlcek.RecipeAPI.shared.DTO.RecipeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recipe")
public class RecipeController {

    @Autowired
    RecipeService recipeService;


    @GetMapping(path = "/{id}")
    public RecipeResponse getRecipeById(@PathVariable Integer id){
        RecipeResponse returnValue = new RecipeResponse();

        RecipeDTO recipeDTO = recipeService.getRecipeById(id);

        ModelMapper modelMapper = new ModelMapper();
        returnValue = modelMapper.map(recipeDTO, RecipeResponse.class);

        return returnValue;
    }

}
