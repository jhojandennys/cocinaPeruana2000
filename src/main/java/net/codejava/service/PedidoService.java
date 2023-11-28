package net.codejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.DAO.IPedidoDAO;
import net.codejava.entity.Pedido;



@Service
public class PedidoService implements IPedidoService{
    @Autowired
    private IPedidoDAO pedidoDAO;
    @Override
    public void guardarPedido(Pedido pedido) {
        pedidoDAO.save(pedido);
    }

    @Override
    public List<Pedido> listarPedido() {
        return (List<Pedido>)pedidoDAO.findAll();
    }

    @Override
    public void eliminarPedido(Long id) { 
        pedidoDAO.deleteById(id);
    }
}
