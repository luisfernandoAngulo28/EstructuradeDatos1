/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapadeNegocio;

/**
1 Atributos
2 Constructor
3 Set’S
4 Get’S
5 ToString
 * @author hp
 */
public class Persona {
    //Constantes
    public static final char MASCULINO='M';
    public static final char FEMENINO='F';       
    public static final char SOLTERO='S'; 
    public static final char CASADO='c';
    public static final char JUNTADO='J';
    public static final char VIUDO='V';   

    //Atributos
    private String nombre;
    private String ci;
    private int edad;
    private char sexo;
    private char estadocivil;
//2 Constructor
    public Persona(String nombre, String ci, int edad, char sexo, char estadocivil) {
        this.nombre = nombre;
        this.ci = ci;
        this.edad = edad;
        this.sexo = sexo;
        this.estadocivil = estadocivil;
    }
//3 Set’S(void)
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEstadocivil(char estadocivil) {
        this.estadocivil = estadocivil;
    }
    
    public void Saludar(){
        System.out.println("Hola  mi nombre es "+nombre+" que tal va la ayudantia? ");
    }
    //4 Get’S(Funciones)

    public String getNombre() {
        return nombre;
    }

    public String getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public char getEstadocivil() {
        return estadocivil;
    }
    //5 ToString

    @Override
    public String toString() {
        return "Persona" + "\n"+"nombre=" + nombre +"\n"+ ", ci=" + ci + "\n"+", edad=" + edad + "\n"+", sexo=" + sexo + "\n"+", estadocivil=" + estadocivil ;
    }
    public static void main(String[] args) {
        Persona x=new Persona("Fernando","12335321", 23, Persona.MASCULINO, Persona.SOLTERO);
        System.out.println(x.toString());
        //x.Saludar();
    }
    
}
