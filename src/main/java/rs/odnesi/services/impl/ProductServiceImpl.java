package rs.odnesi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import rs.odnesi.dao.ProductDao;
import rs.odnesi.model.Company;
import rs.odnesi.model.Product;
import rs.odnesi.services.ProductService;

import java.util.List;

/**
 * Created by Milan on 12/10/2016.
 */
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;
    @Override
    public List<Product> getProductList() {

        return productDao.getProductList();
    }

    @Override
    public Product getProductById(int id) {
        return productDao.getProductById(id);
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);

    }

    @Override
    public void editProduct(Product product) {
        productDao.editProduct(product);

    }

    @Override
    public void deleteProduct(Product product) {
        productDao.deleteProduct(product);

    }

    @Override
    public List<Product> getProductListByCompany(Company company) {
        return productDao.getProductListByCompany(company);
    }
}
