package com.company;

public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AñadirPuertas();
        miCoche.AñadirPuertas();
        miCoche.AñadirPuertas();
        System.out.println("El numero de puertas del coche es de " + miCoche.puertas);
        //variables 1a parte
        int resultado = 0;
        resultado = suma(10,20, 30);
        int a;
        int b;
        int c;
        suma(10, 20, 30);

        resultado = suma (10, 20, 30);
        System.out.println("El resultado de la suma es de " + resultado);

    }

    private static int suma(int a, int b, int c) {
        return a+b+c;
    }
    //2da parte
    static class Coche {
        public int puertas = 0;

        public void AñadirPuertas(){
            this.puertas++;
        }
    }

}
