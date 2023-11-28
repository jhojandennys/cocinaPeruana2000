package net.codejava.service;

import java.util.List;

import net.codejava.entity.Empleado;



public interface IEmpleadoService {
    public void guardarEmpleado(Empleado empleado);
    public List<Empleado> listarEmpleado();
    public void eliminarEmpleado(Long id);

}
