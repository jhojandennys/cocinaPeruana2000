package net.codejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.DAO.IRolDAO;
import net.codejava.entity.Rol;


@Service

public class RolService implements IRolService{
    @Autowired
    private IRolDAO rolDAO;
    
    @Override
    public List<Rol> listarRol() {
        return (List<Rol>)rolDAO.findAll();

    }

}