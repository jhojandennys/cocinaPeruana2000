package net.codejava.service;

import java.util.List;

import net.codejava.entity.Pedido;


public interface IPedidoService {
    public void guardarPedido(Pedido pedido);
    public List<Pedido> listarPedido();
    public void eliminarPedido(Long id);
}
