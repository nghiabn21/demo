package com.webthymeleaf.controller;

import com.webthymeleaf.serviceimpl.CategorysSerImpl;
import com.webthymeleaf.serviceimpl.ProductsSerImpl;
import com.webthymeleaf.serviceimpl.SlidesSerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends MenuController{
    @Autowired
    SlidesSerImpl slidesSer;

    @Autowired
    private CategorysSerImpl categorysSer;

    @Autowired
    private ProductsSerImpl dto;

    @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public ModelAndView homePage() {
      //  ModelAndView mav = new ModelAndView("/index");
        _mvShare.addObject("slides", slidesSer.GetDataSlide());
        _mvShare.addObject("categorys", categorysSer.GetDataCategorys());
        _mvShare.addObject("products", dto.GetDataProduct());

        _mvShare.setViewName("/index");

        return _mvShare;
    }

}
