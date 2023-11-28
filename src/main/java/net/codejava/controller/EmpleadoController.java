package net.codejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.codejava.entity.Empleado;
import net.codejava.service.IEmpleadoService;
import net.codejava.service.IRolService;


@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    private IEmpleadoService empleadoService;
    
    @Autowired
    private IRolService rolService;

    @RequestMapping("/")
    public String inicio(Model model){
        Empleado empleado =new Empleado();
        model.addAttribute("empleado", empleado);
        model.addAttribute("listaEmpleado",empleadoService.listarEmpleado());
        model.addAttribute("listaRol",rolService.listarRol());
        return "empleado/index";

    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(Empleado empleado){
        empleadoService.guardarEmpleado(empleado);
        return "redirect:/empleado/";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id){
        empleadoService.eliminarEmpleado(id);
        return "redirect:/empleado/";
    }
}
