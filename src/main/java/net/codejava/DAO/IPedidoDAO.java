package net.codejava.DAO;
import org.springframework.data.repository.CrudRepository;

import net.codejava.entity.Pedido;


public interface IPedidoDAO extends CrudRepository<Pedido, Long> {
    // Puedes agregar métodos personalizados si es necesario
}


