package net.codejava.DAO;

import org.springframework.data.repository.CrudRepository;

import net.codejava.entity.Insumo;


public interface IInsumosDAO extends CrudRepository<Insumo ,Long> {
    // Puedes agregar métodos personalizados si es necesario
}

