package com.openBootCamp.ejercicios_parte2;

public class Funciones {

    public static void main(String[] args) {

        showMenu();
        System.out.println("***********************");

        String getMenu = getMenu();
        System.out.println(getMenu);
        System.out.println("***********************");

        double price = getPrice();
        System.out.println(price);
        System.out.println("***********************");

        imprimirBuenosDias("Open Bootcamp");
        System.out.println("***********************");

       String saludo = devuelveSaludo("James", "Losane");
       System.out.println(saludo);
       System.out.println("***********************");

    }



    static void showMenu() {
        System.out.println("Bienvenidos al E-commerce de zapatillas:");
        System.out.println("1 - Ver Zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
    }

    static String getMenu() {
        return "Menu del E-commece";
    }

    static double getPrice() {
        return 12d;
    }

    static void imprimirBuenosDias(String name){

        System.out.println("Buenos Días " + name);
    }

    static String devuelveSaludo(String firstName, String lastName){
        return "Hello " + firstName + " " + lastName;
    }
}


