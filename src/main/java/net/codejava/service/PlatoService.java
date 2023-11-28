package net.codejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.DAO.IPlatoDAO;
import net.codejava.entity.Plato;


@Service
public class PlatoService implements IPlatoService{
    @Autowired
    private IPlatoDAO platoDAO;
    @Override
    public void guardarPlato(Plato plato) {
        platoDAO.save(plato);
    }

    @Override
    public List<Plato> listarPlato() {
        return (List<Plato>)platoDAO.findAll();

    }

    @Override
    public void eliminarPlato(Long id) {
        platoDAO.deleteById(id);
    }


}
