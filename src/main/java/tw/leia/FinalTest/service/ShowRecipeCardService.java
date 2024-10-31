package tw.leia.FinalTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.leia.FinalTest.dto.ShowRecipeCardDTO;
import tw.leia.FinalTest.model.Recipes;
import tw.leia.FinalTest.repository.RecipesRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowRecipeCardService {

    @Autowired
    private RecipesRepository recipesRepository;


    public List<ShowRecipeCardDTO> getAllRecipes() {
        return recipesRepository.getAllRecipes();
    }
}
