package com.tomaskadlcek.RecipeAPI.service.implement;

import com.tomaskadlcek.RecipeAPI.repository.Entities.RecipeEntity;
import com.tomaskadlcek.RecipeAPI.repository.repointerface.RecipeRepository;
import com.tomaskadlcek.RecipeAPI.service.RecipeService;
import com.tomaskadlcek.RecipeAPI.shared.DTO.RecipeDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    @Override
    public RecipeDTO getRecipeById(Integer id) {
        RecipeDTO returnValue = new RecipeDTO();

        RecipeEntity recipeEntity = recipeRepository.findByRecipeId(id);

        BeanUtils.copyProperties(recipeEntity, returnValue);

        return returnValue;
    }
}
