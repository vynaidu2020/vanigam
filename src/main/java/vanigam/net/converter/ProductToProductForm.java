package vanigam.net.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import vanigam.net.domain.Product;
import vanigam.net.form.ProductForm;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {
    @Override
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        productForm.setId(product.getId().toHexString());
        productForm.setDescription(product.getDescription());
        productForm.setPrice(product.getPrice());
        productForm.setImageUrl(product.getImageUrl());
        return productForm;
    }
}
