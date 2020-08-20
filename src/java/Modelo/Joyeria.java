/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "joyeria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joyeria.findAll", query = "SELECT j FROM Joyeria j")
    , @NamedQuery(name = "Joyeria.findByIdjoyeria", query = "SELECT j FROM Joyeria j WHERE j.idjoyeria = :idjoyeria")
    , @NamedQuery(name = "Joyeria.findByNombre", query = "SELECT j FROM Joyeria j WHERE j.nombre = :nombre")
    , @NamedQuery(name = "Joyeria.findByUbicacion", query = "SELECT j FROM Joyeria j WHERE j.ubicacion = :ubicacion")
    , @NamedQuery(name = "Joyeria.findByDireccion", query = "SELECT j FROM Joyeria j WHERE j.direccion = :direccion")
    , @NamedQuery(name = "Joyeria.findByNEncargado", query = "SELECT j FROM Joyeria j WHERE j.nEncargado = :nEncargado")
    , @NamedQuery(name = "Joyeria.findByDimension", query = "SELECT j FROM Joyeria j WHERE j.dimension = :dimension")
    , @NamedQuery(name = "Joyeria.findByCiudad", query = "SELECT j FROM Joyeria j WHERE j.ciudad = :ciudad")})
public class Joyeria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idjoyeria")
    private Integer idjoyeria;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Size(max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 45)
    @Column(name = "n_encargado")
    private String nEncargado;
    @Column(name = "dimension")
    private Integer dimension;
    @Size(max = 20)
    @Column(name = "ciudad")
    private String ciudad;

    public Joyeria() {
    }

    public Joyeria(Integer idjoyeria) {
        this.idjoyeria = idjoyeria;
    }

    public Integer getIdjoyeria() {
        return idjoyeria;
    }

    public void setIdjoyeria(Integer idjoyeria) {
        this.idjoyeria = idjoyeria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNEncargado() {
        return nEncargado;
    }

    public void setNEncargado(String nEncargado) {
        this.nEncargado = nEncargado;
    }

    public Integer getDimension() {
        return dimension;
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjoyeria != null ? idjoyeria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joyeria)) {
            return false;
        }
        Joyeria other = (Joyeria) object;
        if ((this.idjoyeria == null && other.idjoyeria != null) || (this.idjoyeria != null && !this.idjoyeria.equals(other.idjoyeria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Joyeria[ idjoyeria=" + idjoyeria + " ]";
    }
    
}
