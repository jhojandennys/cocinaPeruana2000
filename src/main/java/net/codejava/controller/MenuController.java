package net.codejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.codejava.entity.Menu;
import net.codejava.service.IMenuService;


@Controller
@RequestMapping("/menu")
public class MenuController {

    
    @Autowired
    private IMenuService menuService;
    

    @RequestMapping("/")
    public String inicio(Model model){
        Menu menu =new Menu();
        model.addAttribute("menu", menu);
        model.addAttribute("listaMenu",menuService.listarMenu());
        return "menu/index";

    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(Menu menu){
        menuService.guardarMenu(menu);
        return "redirect:/menu/";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id){
        menuService.eliminarMenu(id);
        return "redirect:/menu/";
    }
}

