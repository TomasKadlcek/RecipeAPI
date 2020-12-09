package com.tomaskadlcek.RecipeAPI.repository.repointerface;

import com.tomaskadlcek.RecipeAPI.repository.Entities.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<RecipeEntity, Long>{

}