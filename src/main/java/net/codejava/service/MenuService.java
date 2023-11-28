package net.codejava.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.DAO.IMenuDAO;
import net.codejava.entity.Menu;

@Service
public class MenuService implements IMenuService{
    @Autowired
    private IMenuDAO menuDAO;
    @Override
    public void guardarMenu(Menu menu) {
        menuDAO.save(menu);
    }

    @Override
    public List<Menu> listarMenu() {
        return (List<Menu>)menuDAO.findAll();

    }

    @Override
    public void eliminarMenu(Long id) {
        
        menuDAO.deleteById(id);
    }


}
