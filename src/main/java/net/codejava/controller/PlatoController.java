package net.codejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.codejava.entity.Plato;
import net.codejava.service.IEmpleadoService;
import net.codejava.service.IPlatoService;



@Controller
@RequestMapping("/plato")
public class PlatoController {
    @Autowired
    private IEmpleadoService empleadoService;
    @Autowired
    private IPlatoService platoService;

    @RequestMapping("/")
    public String inicio(Model model){
        Plato plato =new Plato();
        model.addAttribute("plato", plato);
        model.addAttribute("listaPlato",platoService.listarPlato());
        model.addAttribute("listaEmpleado",empleadoService.listarEmpleado());
        return "plato/index";

    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(Plato plato){
        platoService.guardarPlato(plato);
        return "redirect:/plato/";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id){
        platoService.eliminarPlato(id);
        return "redirect:/plato/";
    }
}
