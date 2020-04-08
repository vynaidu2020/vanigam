package vanigam.net.repository;

import org.springframework.data.repository.CrudRepository;

import vanigam.net.domain.Product;

/**
 * Created by vyn on 07/04/2020
 */
public interface ProductRepository extends CrudRepository<Product, String> {
}
