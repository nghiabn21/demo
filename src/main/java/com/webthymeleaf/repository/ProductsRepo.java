package com.webthymeleaf.repository;


import com.webthymeleaf.entity.Products;


import com.webthymeleaf.dto.ProductsDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepo extends JpaRepository<Products, Integer> {
    @Query(value = "select new ProductsDao(p.id , p.id_category, p.size , p.name , p.price , p.sale , p.title , p.highlight  " +
            ", p.new_product , p.detail , c.id  , c.name  , c.code  , c.img  " +
            ", p.created_at ,  p.updated_at) from Products p Inner join Colors c on p.id = c.products.id group by p.id, c.products.id ")
    Page<ProductsDao> GetDataProduct(Pageable pageable);


}
