package rs.odnesi.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rs.odnesi.dao.IngredientsDao;
import rs.odnesi.model.Ingredients;
import rs.odnesi.model.Product;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Milan on 12/10/2016.
 */
@Repository
@Transactional
public class IngredientsDaoImpl implements IngredientsDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Ingredients> getIngredientsList() {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from Ingredients");
        List<Ingredients> ingredientsList=query.list();
        session.flush();
        return ingredientsList;
    }

    @Override
    public Ingredients getIngredientsById(int id) {
        Session session=sessionFactory.getCurrentSession();
        Ingredients ingredients=session.get(Ingredients.class,id);
        session.flush();
        return ingredients;
    }

    @Override
    public void addIngredients(Ingredients ingredients) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(ingredients);
        session.flush();
    }

    @Override
    public void editIngredients(Ingredients ingredients) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(ingredients);
        session.flush();
    }

    @Override
    public void deleteIngredients(Ingredients ingredients) {
        Session session=sessionFactory.getCurrentSession();
        session.delete(ingredients);
        session.flush();
    }

    @Override
    public List<Ingredients> getIngredientsListbyProduct(Product product) {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from product_ingredients where product_id=:productId");
        query.setParameter("productId",product.getId());
        List<Ingredients> ingredientsList=query.list();
        session.flush();
        return ingredientsList;
    }
}
