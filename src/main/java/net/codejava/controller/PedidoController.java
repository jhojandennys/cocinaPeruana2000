package net.codejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.codejava.entity.Pedido;
import net.codejava.service.IDetalle_MenuService;
import net.codejava.service.IPedidoService;


@Controller
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private IPedidoService pedidoService;
    @Autowired
    private IDetalle_MenuService detalle_menuService;

    @RequestMapping("/")
    public String inicio(Model model){
        Pedido pedido =new Pedido();
        model.addAttribute("pedido", pedido);
        model.addAttribute("listaPedido",pedidoService.listarPedido());
        model.addAttribute("listaDetalleMenu",detalle_menuService.listarDetalleMenu());
        return "pedido/index";

    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(Pedido pedido){
        pedidoService.guardarPedido(pedido);
        return "redirect:/pedido/";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id){
        pedidoService.eliminarPedido(id);
        return "redirect:/pedido/";
    }
}