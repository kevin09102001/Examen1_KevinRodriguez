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
public class Elmikoljacksonmorido extends Campistas {
    protected int con=0;

    public Elmikoljacksonmorido() {
    }

    public Elmikoljacksonmorido(String campista, String estado) {
        super(campista, estado);
    }

    public String getCampista() {
        return campista;
    }

    public void setCampista(String campista) {
        this.campista = campista;
    }
}
