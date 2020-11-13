/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_kevinrodriguez;

/**
 *
 * @author Kevin
 */
public class Campistas {
    public String campista;
    public String estado;

    public Campistas() {
    }

    public Campistas(String campista, String estado) {
        this.campista = campista;
        this.estado = estado;
    }

    public String getCampista() {
        return campista;
    }

    public void setCampista(String campista) {
        this.campista = campista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "campista=" + campista + ", estado=" + estado + '}';
    }
    
}
