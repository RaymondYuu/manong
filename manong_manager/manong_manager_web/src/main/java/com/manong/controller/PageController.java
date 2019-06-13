package com.manong.controller;

import com.manong.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.EasyUITree;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author Administrator
 * @create 2019/5/31 0031 上午 8:58
 */
@Controller
public class PageController {
    @Autowired
    ProductCategoryService productCategoryService;

    @RequestMapping("/")
    public String requestIndex(){
        return "index";
    }

    @RequestMapping("/{page}")
    public String requestPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("/product_add")
    public String requestProductAdd(HttpServletRequest request){
        List<EasyUITree> categories = productCategoryService.findProductCategoryListByParentId((short) 0);
        request.getSession().setAttribute("categories",categories);
        return "product_add";
    }

}