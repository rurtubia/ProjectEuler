/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler.entities;

/**
 *
 * @author Randy
 */
public class MultiplesOf3And5 {
    private int tres = 3;
    private int cinco = 5;
    private int mil = 1000;
    private int suma = 0;

    public MultiplesOf3And5(int tres, int cinco, int mil, int suma) {
        tres = this.tres;
        cinco = this.cinco;
        mil = this.mil;
        suma = this.suma;
    }

    public int getTres() {
        return tres;
    }

    public void setTres(int tres) {
        this.tres = tres;
    }

    public int getCinco() {
        return cinco;
    }

    public void setCinco(int cinco) {
        this.cinco = cinco;
    }

    public int getMil() {
        return mil;
    }

    public void setMil(int mil) {
        this.mil = mil;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public MultiplesOf3And5() {
    }
     
    
    public String calculo(int tres, int cinco, int mil, int suma){
        String resultado;
        resultado = "Calculando la suma de los múltiplos de " + tres + " más los múltiplos de " + cinco + " menores a " + mil + "...";
        System.out.println(resultado);
        for (int i = 0; i < mil; i++) {
            if (i%tres == 0 || i%cinco == 0) {
                suma = suma + i;
            }
        }
        System.out.println("...");
        resultado = "La suma total es " + suma;
        return resultado;
    }
}
