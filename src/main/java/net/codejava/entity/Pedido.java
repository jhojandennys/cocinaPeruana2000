package net.codejava.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="pedido")
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedido_id")
    private Long id;

    @Column(name = "pedido_fecha")
    private Date fecha;

    @Column(name = "pedido_estado")
    private String estado;

    @Column(name = "pedido_cliente")
    private String cliente;

    @Column(name = "pedido_mesa")
    private String mesa;

    @Column(name = "precio_total")
    private BigDecimal preciototal;

    @Column(name="pedido_cantidad")
    private int cantidad;

    @ManyToOne
    @JoinColumn(name="detalle_menu_id")
    private DetalleMenu detalleMenu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public DetalleMenu getDetalleMenu() {
        return detalleMenu;
    }

    public void setDetalleMenu(DetalleMenu detalleMenu) {
        this.detalleMenu = detalleMenu;
    }

    public BigDecimal getPreciototal() {
        // Calcular el valor total multiplicando la cantidad por el precio del plato asociado al detalleMenu
        if (cantidad > 0 && detalleMenu != null && detalleMenu.getPlato() != null) {
            BigDecimal precioUnitario = detalleMenu.getPlato().getPrecio();
            preciototal = precioUnitario.multiply(BigDecimal.valueOf(cantidad));
            return preciototal;
        } else {
            return BigDecimal.ZERO; // o null, dependiendo de tus necesidades
        }
    }

    public void setPreciototal(BigDecimal preciototal) {
        this.preciototal = preciototal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
