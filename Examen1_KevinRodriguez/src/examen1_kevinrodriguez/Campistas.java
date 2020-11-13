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
public class Campistas extends agregar {

    public Campistas() {
    }

    public Campistas(String Nombre, String edad, String sexo, String arma, String por, String campista, String estado) {
        super(Nombre, edad, sexo, arma, por, campista, estado);
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
   
}
