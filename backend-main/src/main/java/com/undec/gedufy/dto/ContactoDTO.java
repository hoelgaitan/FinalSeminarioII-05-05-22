package com.undec.gedufy.dto;

import com.undec.gedufy.model.Contacto;
import com.undec.gedufy.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class ContactoDTO {
    private Integer id;
    private String nombre;
    private String correo;
    private String mensaje;

    public ContactoDTO() {
    }

    public ContactoDTO(Integer id, String nombre, String correo, String mensaje) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.mensaje = mensaje;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Contacto getContacto(ContactoDTO contactoDTO) {
        Contacto contacto = new Contacto();
        co
        contacto.setNombre(contactoDTO.getNombre());
        contacto.setCorreo(contactoDTO.getCorreo());
        contacto.setMensaje(contactoDTO.getMensaje());

        return contacto;

    }
}
