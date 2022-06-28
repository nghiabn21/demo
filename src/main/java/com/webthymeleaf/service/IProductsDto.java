package com.webthymeleaf.service;

import com.webthymeleaf.dto.ProductsDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductsDto {
    Page<ProductsDao> GetDataProduct(int pageable);
}
