package rs.odnesi.services;

import rs.odnesi.model.Company;
import rs.odnesi.model.Product;

import java.util.List;

/**
 * Created by Milan on 12/10/2016.
 */
public interface ProductService {
    List<Product> getProductList();
    Product getProductById(int id);
    void addProduct(Product product);
    void editProduct(Product product);
    void deleteProduct(Product product);
    List<Product>getProductListByCompany(Company company);
}
