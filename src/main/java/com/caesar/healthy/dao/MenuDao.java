package com.caesar.healthy.dao;

import com.caesar.healthy.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {

    public List<MainMenu> getMenus();

}
