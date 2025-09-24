package com.example.EcommerceSpring.repository;

import com.example.EcommerceSpring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //custom query method using HQL, explicitly defining the query language
    @Query("Select p from Product p where p.price > :minPrice")
    List<Product> findExpensiveProducts(@Param("minPrice") double minPrice);


    @Query(value="select * from product where match(name, description) against (:keyword)", nativeQuery = true)
    List <Product> searchFullText(@Param("keyword") String keyword);


    @Query("select p from Product p where p.price > :minPrice and p.brand = :brand")
    List<Product> findByBrandAndPrice(
            @Param("minPrice") int price,
            @Param("brand") String brandName
    );

}
