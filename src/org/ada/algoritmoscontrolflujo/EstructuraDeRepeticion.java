package org.ada.algoritmoscontrolflujo;

import java.util.Scanner;

public class EstructuraDeRepeticion {
    public void sumarVector() {
        int[] vectorNumeros = new int[10];
        Scanner lectorDatos = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < vectorNumeros.length; i++) {
            System.out.println("ingrese valor para la posición " + i);
            vectorNumeros[i] = lectorDatos.nextInt();
            suma = suma + vectorNumeros[i];
        }
        System.out.println("La sumatoria de los valores es: " + suma);
    }

    public void sumarVectores() {
        Scanner lectorDatos = new Scanner(System.in);
        int cantidadPosiciones;
        System.out.println("ingrese cantidad de posiciones");
        cantidadPosiciones = lectorDatos.nextInt();
        int[] vectorA = new int[cantidadPosiciones];
        int[] vectorB = new int[cantidadPosiciones];
        int[] vectorC = new int[cantidadPosiciones];
        for (int i = 0; i < cantidadPosiciones; i++) {
            System.out.println("ingrese valor del vector A para la posición " + i);
            vectorA[i] = lectorDatos.nextInt();
            System.out.println("ingrese valor del vector B para la posición " + i);
            vectorB[i] = lectorDatos.nextInt();

            vectorC[i] = vectorA[i] + vectorB[i];
        }
        for (int i = 0; i < cantidadPosiciones; i++) {
            System.out.println("La suma de la posicion " + i + " de los vectores A y B es " + vectorC[i]);
        }

    }

    public void controlDeProductos() {
        Scanner lectorDatos = new Scanner(System.in);
        int[] pedidos = new int[3];
        int[] productos = new int[3];
        int[] stock = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese valor para el producto " + i);
            productos[i] = lectorDatos.nextInt();
            System.out.println("ingrese valor para el pedido " + i);
            pedidos[i] = lectorDatos.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (productos[i] == pedidos[i]) {
                stock[i] = productos[i];
            } else {
                if (pedidos[i] > productos[i]) {
                    stock[i] = (pedidos[i] - productos[i]) * 2;
                } else {
                    stock[i] = pedidos[i];
                }

            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Para el producto " + i + " se requiere comprar " + stock[i]);
        }

    }

    public void intercambiarVector() {
        Scanner lectorDatos = new Scanner(System.in);
        int[] vectorValores = new int[6];
        int[] vectorAu = new int[6];
        int auxConteo = 5;
        for (int i = 0; i < 6; i++) {
            System.out.println("ingrese valor para la posicion " + i);
            vectorValores[i] = lectorDatos.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            vectorAu[auxConteo]  = vectorValores [i]  ;
            auxConteo--;
        }
        for (int i = 0; i < 6; i++){
            System.out.println("El valor del vector es " + vectorAu [i]);
        }
    }
    public void contadorDeCeros (){
        Scanner lectorDatos = new Scanner(System.in);
        int [][] matriz = new int[4][4] ;
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("ingrese valor para la posicion " + i + " "+ j);
                matriz[i][j] = lectorDatos.nextInt();

                if (matriz[i][j] == 0) {
                    contador++;
                }
            }
        }
        System.out.println("la cantidad de ceros es " + contador);



}
 public void calcularKm (){
        Scanner lectorDatos = new Scanner (System.in);

        System.out.println("ingrese cantidad de choferes ");
        int cantChoferes = lectorDatos.nextInt();
        int [] totalKm = new int  [cantChoferes];
        String [] nombres = new String [cantChoferes];
        int [][] kmRecorridos = new int [cantChoferes][6];


     for (int i = 0; i < cantChoferes; i++) {
         System.out.println("ingrese nombre del chofer " + i);
         nombres [i] = lectorDatos.next();
         for (int j = 0; j < 6; j++) {
             System.out.println("ingrese km recorridos para el dia " + j);
             kmRecorridos [i][j] = lectorDatos.nextInt();
         }
     }
     for (int i = 0; i < cantChoferes; i++) {
        totalKm[i] = 0;
        for (int j = 0; j < 6; j++){
            totalKm[i] = totalKm[i] + kmRecorridos [i][j];
         }

         }
     for (int i = 0; i < cantChoferes; i++) {
         System.out.println ("El recorrido del chofer " + nombres [i]);
         for (int j = 0; j < 6; j++){
         System.out.println (  "en el dia " + j + "es " + kmRecorridos[i][j]);




     }
         System.out.println("El total de km recorridos es " + totalKm [i]);
     }

    }
    public void determinarMayorVentas () {
        Scanner lectorDatos = new Scanner(System.in);
        int[][] ventas = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("ingrese ventas del empleado " + i + " para el dia " + j);
                ventas[i][j] = lectorDatos.nextInt();
            }
        }
        int mayorVenta = ventas[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (mayorVenta < ventas[i][j]){
                mayorVenta = ventas[i][j];}
            }
            }
        System.out.println("La venta mayor fue " + mayorVenta);
    }

    public void sumarMatrices() {
        Scanner lectorDatos = new Scanner(System.in);

        System.out.println("ingrese cantidad de filas");
        int filas = lectorDatos.nextInt();
        System.out.println("ingrese cantidad de columnas");
        int columnas = lectorDatos.nextInt();

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("ingrese valores de la matriz A para la posición " + i + j);
                matrizA[i][j] = lectorDatos.nextInt();
                System.out.println("ingrese valores de la matriz B para la posicion " + i + j );
                matrizB[i][j] = lectorDatos.nextInt();
    }}
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB [i][j];
                System.out.println("El resultado de la suma es " + resultado[i][j]);

            }}


    }





    public void conteoWhile() {
        Scanner lectorDatos = new Scanner(System.in);
        int numero = 10;
        while (numero >= 1) {
            System.out.println(numero);
            numero--;

        }


    }

    public void conteoDoWhile() {
        Scanner lectorDatos = new Scanner(System.in);
        int numero = 10;
        do {
            System.out.println(numero);
            numero--;

        } while (numero >= 1);
    }

    public void identificarPositivoONegativo() {
        Scanner lectorDatos = new Scanner(System.in);
        int postivos = 0;
        int negativos = 0;
        int numero = 0;
        int contador = 0;

        do {
            System.out.println("ingrese numero");
            numero = lectorDatos.nextInt();
            if(numero > 0){
                postivos++;
            } else {
                negativos++;
            } contador++;
        } while (contador < 10 );

        System.out.println("La cantidad de numeros postivos es: " + postivos);
        System.out.println("La cantidad de numeros negativos es: " + negativos);






    }

    public void validarCredenciales() {
        Scanner lectorDatos = new Scanner(System.in);
        final String USUARIO = "abril";
        final String CONTRASEÑA = "bocajuniors";
        String usuario;
        String contraseña;
        int intentos = 3;
        do {
            System.out.println("ingrese usuario");
            usuario = lectorDatos.next();
            System.out.println("ingrese contraSEÑA");
            contraseña = lectorDatos.next();
            if (USUARIO.equals(usuario) && CONTRASEÑA.equals(contraseña)) {
                System.out.println("Ingreso exitoso");
                break;
            } else {
                System.out.println("usuario o contraseña incorrecta");
            }
            intentos--;
        } while (intentos > 0);

        System.out.println("SEE te acabaron los intentos");
    }
}
