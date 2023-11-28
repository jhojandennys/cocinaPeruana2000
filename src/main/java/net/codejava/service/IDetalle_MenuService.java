package net.codejava.service;

import java.util.List;

import net.codejava.entity.DetalleMenu;



public interface IDetalle_MenuService {
    public void guardarDetalleMenu(DetalleMenu detalleMenu);
    public List<DetalleMenu> listarDetalleMenu();
    public void eliminarDetalleMenu(Long id);

}
