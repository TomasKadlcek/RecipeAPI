package com.tomaskadlcek.RecipeAPI.repository.repointerface;

import com.tomaskadlcek.RecipeAPI.repository.Entities.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RecipeRepository extends JpaRepository<RecipeEntity, Long>{

}