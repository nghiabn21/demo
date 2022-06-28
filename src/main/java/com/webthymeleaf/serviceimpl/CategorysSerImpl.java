package com.webthymeleaf.serviceimpl;

import com.webthymeleaf.entity.Categorys;
import com.webthymeleaf.repository.CategoryRepo;
import com.webthymeleaf.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorysSerImpl implements ICategoryService {
    @Autowired
    private CategoryRepo categoryRepo ;
    @Override
    public List<Categorys> GetDataCategorys() {
        return categoryRepo.findAll();
    }
}
