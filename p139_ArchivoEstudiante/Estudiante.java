package p139_ArchivoEstudiante;

import java.io.Serializable;

public class Estudiante implements Serializable {
    private String Nombre;
    private int Edad;
    private float Promedio;
    private String Sexo;

    public Estudiante(String nombre, int edad, float promedio, String sexo) {
        Nombre = nombre;
        Edad = edad;
        Promedio = promedio;
        Sexo = sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public float getPromedio() {
        return Promedio;
    }

    public void setPromedio(float promedio) {
        Promedio = promedio;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre=" + Nombre + ", Edad=" + Edad + ", Promedio=" + Promedio + ", Sexo=" + Sexo + "]";
    }
}
