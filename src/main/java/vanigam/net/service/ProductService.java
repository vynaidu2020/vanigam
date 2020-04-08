package vanigam.net.service;


import java.util.List;

import vanigam.net.domain.Product;
import vanigam.net.form.ProductForm;

/**
 * Created by vyn on 07/04/2020
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
