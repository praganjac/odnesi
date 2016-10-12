package rs.odnesi.dao;

import rs.odnesi.model.Ingredients;
import rs.odnesi.model.Product;

import java.util.List;

/**
 * Created by Milan on 12/10/2016.
 */
public interface IngredientsDao {
    List<Ingredients> getIngredientsList();
    Ingredients getIngredientsById(int id);
    void addIngredients(Ingredients ingredients);
    void editIngredients(Ingredients ingredients);
    void deleteIngredients(Ingredients ingredients);
    List<Ingredients> getIngredientsListbyProduct(Product product);
}
