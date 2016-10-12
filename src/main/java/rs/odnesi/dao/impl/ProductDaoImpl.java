package rs.odnesi.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rs.odnesi.dao.ProductDao;
import rs.odnesi.model.Company;
import rs.odnesi.model.Product;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Milan on 12/10/2016.
 */
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Product> getProductList() {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from Product");
        List<Product> productList=query.list();
        session.flush();
        return productList;
    }

    @Override
    public Product getProductById(int id) {
        Session session=sessionFactory.getCurrentSession();
        Product product=session.get(Product.class,id);
        session.flush();
        return product;
    }

    @Override
    public void addProduct(Product product) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

    @Override
    public void editProduct(Product product) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

    @Override
    public void deleteProduct(Product product) {
        Session session=sessionFactory.getCurrentSession();
        session.delete(product);
        session.flush();
    }

    @Override
    public List<Product> getProductListByCompany(Company company) {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from Product where company_id=:companyId");
        query.setParameter("companyId",company.getCompanyId());
        List<Product> ingredientsList=query.list();
        session.flush();
        return ingredientsList;

    }
}
