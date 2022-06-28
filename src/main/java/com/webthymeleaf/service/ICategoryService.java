package com.webthymeleaf.service;

import com.webthymeleaf.entity.Categorys;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoryService {
     public List<Categorys>  GetDataCategorys();
}
