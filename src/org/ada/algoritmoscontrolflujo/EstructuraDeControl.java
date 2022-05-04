package org.ada.algoritmoscontrolflujo;

import java.util.Scanner;

public class EstructuraDeControl {

    public void identificarNumeroMayor(){
        Scanner lectorDatos = new Scanner (System.in);
        System.out.println("ingrese primer numero");
        int numA = lectorDatos.nextInt();
        System.out.println("ingrese segundo numero");
        int numB = lectorDatos.nextInt();
        int numMayor;
        if (numA  > numB){
            numMayor = numA;
        } else numMayor = numB;
        System.out.println("El numero mayor es " + numMayor );

    }
    public void identificarNumeroPositivo(){
        Scanner lectorDatos = new Scanner (System.in);
        System.out.println("ingrese numero");
        int numero = lectorDatos.nextInt();
        if (numero >= 0) {
            System.out.println("El numero "+ numero + " es positivo");
        } else System.out.println("El numero " + numero + " es negativo");

    }
    public void calcularPrecioLapices(){
        Scanner lectorDatos = new Scanner (System.in);
        int total = 0;
        System.out.println("ingrese cantidad de lapices");
        int lapices = lectorDatos.nextInt();
        if (lapices >= 1000 ) {
            total = lapices * 85;

        } else total = lapices * 90;
        System.out.println("El precio de los lapices es " + total );
    }

    public void determinarNumeroMayor() {
        Scanner lectorDatos = new Scanner(System.in);
        int mayor;
        System.out.println("ingrese numero A");
        int numA = lectorDatos.nextInt();
        System.out.println("ingrese numero B");
        int numB = lectorDatos.nextInt();
        System.out.println("ingrese numero C");
        int numC = lectorDatos.nextInt();

        if (numA > numB && numA > numC) {
                mayor = numA;
        } else if (numB > numC && numB > numA ) {
            mayor = numB;
        } else mayor = numC;
        System.out.println("El numero mayor es " + mayor);
    }
    public void decrementarNumero (){
        int numero = 6;
        System.out.println ("El valor del numero es: " + numero );
        System.out.println ("El valor del numero con pre-decremento es: " + --numero );
        System.out.println ("El valor del numero con post- decremento es: " + numero-- );
        System.out.println ("El valor del numero es: " + numero );


    }
    public void incrementarNumero (){
        int numero = 6;
        System.out.println ("El valor del numero es: " + numero );
        System.out.println ("El valor del numero con pre-decremento es: " + ++numero );
        System.out.println ("El valor del numero con post- decremento es: " + numero++ );
        System.out.println ("El valor del numero es: " + numero );


    }

}
