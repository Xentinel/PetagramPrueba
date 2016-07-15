package com.think.petagram2;

/**
 * Created by julio on 14/07/2016.
 */
import java.io.Serializable;
public class mascota implements Serializable {
    private String nombre;
    private int foto;
    private int numLikes;

    public mascota(String nombre, int foto, int numLikes) {
        this.nombre = nombre;
        this.foto = foto;
        this.numLikes = numLikes;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    public void incLikes() {this.numLikes++;}
    public String getNombre() {
        return nombre;
    }

    public int getFoto() {
        return foto;
    }

    public String getNumLikes() {
        return Integer.toString(numLikes);
    }


}
