package com.tomaskadlcek.RecipeAPI.controller;

import com.tomaskadlcek.RecipeAPI.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recipe")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    

}
