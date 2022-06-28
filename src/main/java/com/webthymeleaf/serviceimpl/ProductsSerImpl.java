package com.webthymeleaf.serviceimpl;

import com.webthymeleaf.dto.ProductsDao;
import com.webthymeleaf.repository.ProductsRepo;
import com.webthymeleaf.service.IProductsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsSerImpl implements IProductsDto {
    @Autowired
    ProductsRepo productsRepo ;
    @Override
    public Page<ProductsDao> GetDataProduct(int pageable){
     //   List<ProductsDao> list = productsRepo.GetDataProduct();
        Pageable pageable1 = PageRequest.of(pageable -1 , 12);
        Page<ProductsDao> list = productsRepo.GetDataProduct(pageable1);
        return  list;
    }
}
