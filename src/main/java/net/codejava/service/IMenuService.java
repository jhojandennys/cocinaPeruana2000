package net.codejava.service;

import java.util.List;

import net.codejava.entity.Menu;

public interface IMenuService {
    public void guardarMenu(Menu menu);
    public List<Menu> listarMenu();
    public void eliminarMenu(Long id);

}
