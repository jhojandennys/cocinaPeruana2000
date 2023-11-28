package net.codejava.DAO;

import org.springframework.data.repository.CrudRepository;

import net.codejava.entity.Empleado;


public interface IEmpleadoDAO extends CrudRepository<Empleado, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
