package org.ada.algoritmoslineales;

import java.util.Scanner;

public class Calculador {
    public void sumarNumeros () {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("Ingrese sumando A");
        int sumandoA = lectorDatos.nextInt();
        System.out.println("ingrese sumando B");
        int sumandoB = lectorDatos.nextInt();
        int suma = sumandoA + sumandoB;
        System.out.println("el resultado de la suma " + suma );

    }
    public void calcularPromedio(){
        final byte CANT_NOTAS = 4;
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("ingrese calificacion 1");
        double nota1 = lectorDatos.nextDouble();
        System.out.println("ingrese calificacion 2");
        double nota2 = lectorDatos.nextDouble();
        System.out.println("ingrese calificacion 3");
        double nota3 = lectorDatos.nextDouble();
        System.out.println("ingrese calificacion 4");
       double nota4 = lectorDatos.nextDouble();

        double promedio = (nota1 + nota2 + nota3 + nota4) / CANT_NOTAS;
        System.out.println("El promedio es: " + promedio );


    }
    public void calcularArea(){
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("ingrese base");
        int base = lectorDatos.nextInt();
        System.out.println("ingrese altura");
        int altura = lectorDatos.nextInt();
        int area = base * altura;
        System.out.println("El área del rectángulo es " + area );
    }
    public void areaCircunferencia () {
        Scanner lectorDatos = new Scanner(System.in);
        final double PI = 3.1416;
        System.out.println("ingrese radio de la circunferencia:");
        int radio = lectorDatos.nextInt();
        double area = PI * radio * radio;
        System.out.println("El área de la circunferencia es: "+ area );
    }

    public void calcularGanancia (){
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("ingrese cantidad de litros");
        double litros = lectorDatos.nextInt();
        System.out.println("ingrese precio por galon");
        double precioGalon = lectorDatos.nextInt();
        double galones = litros / 3.785;
        double ganancia = galones * precioGalon;
        System.out.println("La ganancia es " + ganancia );

    }
    public void calcularDistancia (){
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("ingrese primer abscisa");
        int x1 = lectorDatos.nextInt();
        System.out.println("ingrese segunda abscisa");
        int x2 = lectorDatos.nextInt();
        System.out.println("ingrese primer ordenada");
        int y1 = lectorDatos.nextInt();
        System.out.println("ingrese segunda ordenada");
        int y2 = lectorDatos.nextInt();
        double abscisa = x2 - x1;
        double ordenada = y2 - y1;
        double distancia = Math.sqrt (abscisa * abscisa + ordenada * ordenada);
        System.out.println("La distancia entre dos puntos es: " + distancia );



    }

}
