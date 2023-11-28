package net.codejava.DAO;
import org.springframework.data.repository.CrudRepository;

import net.codejava.entity.DetalleMenu;


public interface IDetalleMenuDAO extends CrudRepository<DetalleMenu, Long> {
    // Puedes agregar métodos personalizados si es necesario
}

