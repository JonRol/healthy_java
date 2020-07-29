package com.caesar.healthy.controller;

import com.alibaba.fastjson.JSON;
import com.caesar.healthy.bean.MainMenu;
import com.caesar.healthy.dao.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * 菜单控制器类
 */
@RestController
public class MenuController {

    @Autowired
    private MenuDao menuDao;

    @RequestMapping("/menus")
    public String getAllMenus() {
        System.out.println("访问成功！");
        HashMap<String, Object> data = new HashMap<>();
        //int status = 404;// 错误404 成功200
        List<MainMenu> menus = menuDao.getMenus();
        if (menus != null) {
            data.put("menus",menus);
            data.put("flag",200);
        }else {
            data.put("flag",404);
        }
        String s = JSON.toJSONString(data);
        System.out.println("s = " + s);
        return s;
    }

}
