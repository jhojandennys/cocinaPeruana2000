package net.codejava.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.codejava.DAO.IEmpleadoDAO;
import net.codejava.entity.Empleado;



@Service
public class EmpleadoService implements IEmpleadoService{
    @Autowired
    private IEmpleadoDAO empleadoDAO;
    public EmpleadoService(IEmpleadoDAO empleadoDAO) {
        super();
        this.empleadoDAO = empleadoDAO;
    }

    @Override
    public void guardarEmpleado(Empleado empleado) {
        empleadoDAO.save(empleado);
    }

    @Override
    public List<Empleado> listarEmpleado() {
        return (List<Empleado>)empleadoDAO.findAll();
    }

    @Override
    public void eliminarEmpleado(Long id) { 
        empleadoDAO.deleteById(id);
    }

    /* 
    @Override
    public Empleado guardar(EmpleadoRegistroDTO registro) {
        Empleado empleado = new Empleado(registro.getNombre(),registro.getCorreo(),registro.getContraseña(),Arrays.asList(new Rol()));
       return empleadoDAO.save(empleado);
    }
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Empleado empleado empleadoDAO.findByEmail(username);

    }
*/
  

}
