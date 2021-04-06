package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Product;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer> {

	@Query(value = "select * from product where featured = :featured limit :n", nativeQuery = true)
	public List<Product> findByFeatured(@Param("featured") boolean featured, @Param("n") int n);

	@Query(value = "select * from product order by id desc limit :n", nativeQuery = true)
	public List<Product> lastedProduct(@Param("n") int n);
}
