package net.codejava.service;
import java.util.List;

import net.codejava.entity.Insumo;

public interface IInsumoService {
    void guardarInsumo(Insumo insumo);
    List<Insumo> listarInsumo();
    void eliminarInsumo(Long id);
}
