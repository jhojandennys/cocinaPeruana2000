package net.codejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.DAO.IDetalleMenuDAO;
import net.codejava.entity.DetalleMenu;



@Service
public class Detalle_MenuService implements IDetalle_MenuService{
    @Autowired
    private IDetalleMenuDAO detalle_menuDAO;
    @Override
    public void guardarDetalleMenu(DetalleMenu detalle_menu) {
        detalle_menuDAO.save(detalle_menu);
    }

    @Override
    public List<DetalleMenu> listarDetalleMenu() {
        return (List<DetalleMenu>)detalle_menuDAO.findAll();
    }

    @Override
    public void eliminarDetalleMenu(Long id) { 
        detalle_menuDAO.deleteById(id);
    }
}
