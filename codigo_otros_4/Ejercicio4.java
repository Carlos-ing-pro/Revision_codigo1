package com.generation;
import java.util.Scanner; //se coloco la importacion del scanner y la clase main, se borro el segundo scanner, se agrero una llave faltante en el if del case, se borro un parentsis extra y se agrego el break a los demas case

public class Codigo4 {
 public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");

        String j2 = s.nextLine();

        if (j1 == j2) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2 == "tijeras") {
                        g = 1;
                    }
                    break;

                case "papel":
                    if (j2 == "piedra") {
                        g = 1;
                    }
                    break;
                case "tijera":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
                default:
            }
            System.out.println("Gana el jugador " + g);
        }

    }

}

