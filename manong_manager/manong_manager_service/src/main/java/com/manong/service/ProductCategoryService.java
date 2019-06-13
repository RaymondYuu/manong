package com.manong.service;

import pojo.EasyUITree;
import pojo.ResponseJsonResult;

import java.util.List;

/**
 * @Author Administrator
 * @create 2019/5/31 0031 上午 8:54
 */

public interface ProductCategoryService {
    List<EasyUITree> findProductCategoryListByParentId(Short parentid);

    ResponseJsonResult addCategory(Short parentid, String name);


    ResponseJsonResult deleteCategory(Short parentid,Short id);

}

