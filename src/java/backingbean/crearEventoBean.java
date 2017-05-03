/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingbean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import jpa.Evento;
import jpa.Evento.tipoEvento;

/**
 *
 * @author gordo
 */
@Named(value = "newEv")
@RequestScoped
public class crearEventoBean {
    
    @Inject
    private BaseDatosFicticia bd;
    
    //private Long id_evento;
    private String nombre;
    //private Date fecha_inicio;
    //private Date fecha_fin;
    //private Time hora_inicio;
    //private Time hora_fin;
    private String descripcion;
    private String organizador;
    private int tlf_contacto;
    //private Boolean destacado;
    private String localidad;
    private String direccion;
    private String complejo;
    private double precio;
    //private Boolean visible;
    //private Boolean propuesto;
    private tipoEvento tevento;
    //private List<Valoracion> valoraciones;
    //private List<Usuarioreg> likes;
    
    public crearEventoBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public int getTlf_contacto() {
        return tlf_contacto;
    }

    public void setTlf_contacto(int tlf_contacto) {
        this.tlf_contacto = tlf_contacto;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComplejo() {
        return complejo;
    }

    public void setComplejo(String complejo) {
        this.complejo = complejo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public tipoEvento getTevento() {
        return tevento;
    }

    public void setTevento(tipoEvento tevento) {
        this.tevento = tevento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String creaEvento(){
        //try{
            Evento e = new Evento();
            e.setNombre(nombre);
            e.setComplejo(complejo);
            e.setDescripcion(descripcion);
            e.setDestacado(Boolean.FALSE);
            e.setDireccion(direccion);
            e.setLocalidad(localidad);
            e.setOrganizador(organizador);
            e.setPrecio(precio);
            e.setPropuesto(Boolean.TRUE);
            e.setTe(tevento);
            e.setTlf_contacto(tlf_contacto);
            e.setVisible(Boolean.FALSE);
            
            bd.addEvento(e);
        //}catch(){}
    
        return "index.xhtml";
    }
    
   
    
}
