package net.codejava.service;

import java.util.List;

import net.codejava.entity.Plato;


public interface IPlatoService {
    public void guardarPlato(Plato plato);
    public List<Plato> listarPlato();
    public void eliminarPlato(Long id);
    
}
