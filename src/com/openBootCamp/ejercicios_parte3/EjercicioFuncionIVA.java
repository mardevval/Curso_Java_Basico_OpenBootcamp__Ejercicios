package com.openBootCamp.ejercicios_parte3;

public class EjercicioFuncionIVA {

    public static void main(String[] args) {

        double precioFinal = devuelveIVA(100d);
        System.out.println("El precio con el IVA incluido es: " + precioFinal + " €");

    }

    static double devuelveIVA(double precio) {

        return precio=precio+(precio*0.21);
    }
}
