package net.codejava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.DAO.IInsumosDAO;
import net.codejava.entity.Insumo;

import java.util.List;

@Service
public class InsumoService implements IInsumoService {

    @Autowired
    private IInsumosDAO insumosDAO;
    @Override
    public void guardarInsumo(Insumo insumo) {
        insumosDAO.save(insumo);
    }
    @Override
    public List<Insumo> listarInsumo() {
        return (List<Insumo>) insumosDAO.findAll();
    }
    @Override
    public void eliminarInsumo(Long id) {
       insumosDAO.deleteById(id);
    }
}