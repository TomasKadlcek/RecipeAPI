package com.tomaskadlcek.RecipeAPI.service.implement;

import com.tomaskadlcek.RecipeAPI.repository.repointerface.RecipeRepository;
import com.tomaskadlcek.RecipeAPI.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

}
