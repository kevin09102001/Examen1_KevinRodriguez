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
public class armast {
    public String arma;
    public String por;
    public armast() {
    }

    public armast(String arma) {
        this.arma = arma;
    }

    public armast(String arma, String por) {
        this.arma = arma;
        this.por = por;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getPor() {
        return por;
    }

    public void setPor(String por) {
        this.por = por;
    }

    
    
}
