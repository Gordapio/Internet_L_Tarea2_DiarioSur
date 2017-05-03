/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingbean;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import jpa.Evento;
import jpa.Usuarioreg;
import jpa.Valoracion;

/**
 *
 * @author gordo
 */
@Named
@ApplicationScoped
public class BaseDatosFicticia {
    private ArrayList<Evento> listaEventos;
    private ArrayList<Usuarioreg> listaUsuarios;
    private ArrayList<Valoracion> listaValoraciones;
    /**
     * Creates a new instance of BaseDatosFicticia
     */
    public BaseDatosFicticia() {
        listaEventos=new ArrayList<>();
        listaUsuarios=new ArrayList<>();
        listaValoraciones=new ArrayList<>();
        
        Evento e= new Evento();
        e.setNombre("Fiesta1");
        e.setDescripcion("Cagontusmuela");
        e.setLocalidad("Alozaina");
        e.setVisible(Boolean.TRUE);
        e.setPropuesto(Boolean.FALSE);
        //e.setFecha_inicio((Date) Calendar.getInstance().getTime());
        listaEventos.add(e);
        
        Evento ev= new Evento();
        ev.setNombre("Feria");
        ev.setLocalidad("Bonela");
        ev.setVisible(Boolean.TRUE);
        ev.setPropuesto(Boolean.FALSE);
        listaEventos.add(ev);
        
        //eventos propuestos
        Evento eve= new Evento();
        eve.setNombre("Fiestaasasdasdasdas");
        eve.setDescripcion("enga amo");
        eve.setLocalidad("Churripena");
        eve.setVisible(Boolean.TRUE);
        eve.setPropuesto(Boolean.TRUE);
        listaEventos.add(eve);
        
        Usuarioreg u=new Usuarioreg();
        u.setNickname("Paco");
        u.setContraseña("123");
        u.setRol(Usuarioreg.tipoRol.normal);
        listaUsuarios.add(u);
        u.setNickname("Periodista1");
        u.setContraseña("123");
        u.setRol(Usuarioreg.tipoRol.periodista);
        listaUsuarios.add(u);
        u.setNickname("Normal");
        u.setContraseña("123");
        u.setRol(Usuarioreg.tipoRol.normal);
        listaUsuarios.add(u);
    }
    
    public ArrayList<Evento> getEventos(){return listaEventos;}
    public ArrayList<Usuarioreg> getUsuarios(){return listaUsuarios;}
    public ArrayList<Valoracion> getValoraciones(){return listaValoraciones;}
    public void addEvento(Evento e){listaEventos.add(e);}
    public void addUsuario(Usuarioreg u){listaUsuarios.add(u);}
    public Evento getEvento(){return listaEventos.get(0);}
}
