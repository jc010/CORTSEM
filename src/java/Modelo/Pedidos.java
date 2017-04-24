/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p")
    , @NamedQuery(name = "Pedidos.findById", query = "SELECT p FROM Pedidos p WHERE p.id = :id")
    , @NamedQuery(name = "Pedidos.findByFPedido", query = "SELECT p FROM Pedidos p WHERE p.fPedido = :fPedido")
    , @NamedQuery(name = "Pedidos.findByFEntrega", query = "SELECT p FROM Pedidos p WHERE p.fEntrega = :fEntrega")
    , @NamedQuery(name = "Pedidos.findByEmpleadoId", query = "SELECT p FROM Pedidos p WHERE p.empleadoId = :empleadoId")
    , @NamedQuery(name = "Pedidos.findByDescripcion", query = "SELECT p FROM Pedidos p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Pedidos.findByClienteId", query = "SELECT p FROM Pedidos p WHERE p.clienteId = :clienteId")
    , @NamedQuery(name = "Pedidos.findByHabilitado", query = "SELECT p FROM Pedidos p WHERE p.habilitado = :habilitado")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "f_pedido")
    @Temporal(TemporalType.DATE)
    private Date fPedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "f_entrega")
    @Temporal(TemporalType.DATE)
    private Date fEntrega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empleado_id")
    private int empleadoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliente_id")
    private int clienteId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "habilitado")
    private String habilitado;

    public Pedidos() {
    }

    public Pedidos(Integer id) {
        this.id = id;
    }

    public Pedidos(Integer id, Date fPedido, Date fEntrega, int empleadoId, String descripcion, int clienteId, String habilitado) {
        this.id = id;
        this.fPedido = fPedido;
        this.fEntrega = fEntrega;
        this.empleadoId = empleadoId;
        this.descripcion = descripcion;
        this.clienteId = clienteId;
        this.habilitado = habilitado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFPedido() {
        return fPedido;
    }

    public void setFPedido(Date fPedido) {
        this.fPedido = fPedido;
    }

    public Date getFEntrega() {
        return fEntrega;
    }

    public void setFEntrega(Date fEntrega) {
        this.fEntrega = fEntrega;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Pedidos[ id=" + id + " ]";
    }
    
}
