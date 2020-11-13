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
public class agregar {
    protected String Nombre;
    protected int edad;
    protected String sexo;
    public String arma;
    public String por;
    public String campista;
        public String estado;
    public agregar() {
        
    }

    public agregar(String Nombre, int edad, String sexo, String arma, String por, String campista, String estado) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.arma = arma;
        this.por = por;
        this.campista = campista;
        this.estado = estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        return "agregar{" + "Nombre=" + Nombre + ", edad=" + edad + ", sexo=" + sexo + ", arma=" + arma + ", porcentaje de daño=" + por + ", campista=" + campista + ", estado=" + estado + '}';
    }


}




   
   
   

   
   
   

   
   
   

   
   
   

   
   
   

   
   
   


   
   
   
   
   
   

