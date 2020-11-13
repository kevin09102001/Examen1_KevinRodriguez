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
    public agregar() {
    }

    public agregar(String Nombre, int edad, String sexo) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
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


    @Override
    public String toString() {
        return "agregar{" + "Nombre=" + Nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
    
}
