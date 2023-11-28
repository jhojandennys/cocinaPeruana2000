package net.codejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.codejava.entity.Insumo;
import net.codejava.service.IEmpleadoService;
import net.codejava.service.IInsumoService;


@Controller
@RequestMapping("/insumo")
public class InsumosController {
    @Autowired
    private IEmpleadoService empleadoService;
    @Autowired
    private IInsumoService insumoService;

    @RequestMapping("/")
    public String inicio(Model model){
        Insumo insumo =new Insumo();
        model.addAttribute("insumo", insumo);
        model.addAttribute("listaInsumo",insumoService.listarInsumo());
        model.addAttribute("listaEmpleado",empleadoService.listarEmpleado());
        return "insumo/index";

    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(Insumo insumo){
        insumoService.guardarInsumo(insumo);
        return "redirect:/insumo/";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id){
        insumoService.eliminarInsumo(id);
        return "redirect:/insumo/";
    }
}