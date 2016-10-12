package rs.odnesi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import rs.odnesi.dao.IngredientsDao;
import rs.odnesi.model.Ingredients;
import rs.odnesi.model.Product;
import rs.odnesi.services.IngredientsService;

import java.util.List;

/**
 * Created by Milan on 12/10/2016.
 */
public class IngredientsServiceImpl implements IngredientsService {
    @Autowired
    IngredientsDao ingredientsDao;
    @Override
    public List<Ingredients> getIngredientsList() {
        return ingredientsDao.getIngredientsList();
    }

    @Override
    public Ingredients getIngredientsById(int id) {
        return ingredientsDao.getIngredientsById(id);
    }

    @Override
    public void addIngredients(Ingredients ingredients) {
        ingredientsDao.addIngredients(ingredients);

    }

    @Override
    public void editIngredients(Ingredients ingredients) {
        ingredientsDao.editIngredients(ingredients);

    }

    @Override
    public void deleteIngredients(Ingredients ingredients) {
        ingredientsDao.deleteIngredients(ingredients);

    }

    @Override
    public List<Ingredients> getIngredientsListbyProduct(Product product) {
        return ingredientsDao.getIngredientsListbyProduct(product);
    }
}
