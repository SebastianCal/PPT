package Principal;

import javax.sound.midi.spi.SoundbankReader;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Random ale = new Random();

        int jugado_01;
        int jugado_02;
        int win_01 = 0;
        int win_02 = 0;


        int pasada_01 = 0;


        // 0 = piedra
        // 1 = papel 
        // 2 = tijera

        do {

            jugado_01 = ale.nextInt(3);

            jugado_02 = ale.nextInt(3);

            System.out.println(jugado_01);
            System.out.println(jugado_02);

            if (jugado_01 == jugado_02) {

                System.out.println("EMPATE");
                win_01 = 0;
                win_02 = 0;

            } else if (jugado_01 == 0 & jugado_02 == 1) {
                pasada_01 = 1;
                System.out.println("Gana Jugador 2");

                    win_02 = win_02 + 1;



            } else if (jugado_01 == 0 & jugado_02 == 2) {
                pasada_01 = 0;
                System.out.println("Gana jugador 1");

                    win_01 = win_01 + 1;


            } else if (jugado_01 == 1 & jugado_02 == 0) {
                pasada_01 = 1;
                System.out.println("Gana jugador 1");

                    win_01 = win_01 + 1;


            } else if (jugado_01 == 1 & jugado_02 == 2) {
                pasada_01 = 2;
                System.out.println("Gana jugador 2");

                    win_02 = win_02 + 1;


            } else if (jugado_01 == 2 & jugado_02 == 0) {
                pasada_01 = 0;
                System.out.println("Gana jugador 2");

                    win_02 = win_02 + 1;


            } else if (jugado_01 == 2 & jugado_02 == 1) {
                pasada_01 = 2;
                System.out.println("Gana jugador 1");

                    win_01 = win_01 + 1;

            }

            pasada_01 = 0;

        }while (win_01 < 2);



        System.out.println("Jugador 1 a ganado: "+win_01+" veces");
        System.out.println("Jugador 2 a ganado: "+win_02+" veces");

        if (      win_01 == win_02 & win_02 == win_01){

            System.out.println("EMPATE");

        } else if (win_02 <= 2 & win_01 >= 2) {

            System.out.println("GANO JUGAOR 1");
        } else if (win_01 <= 2 & win_02 >= 2) {

            System.out.println("GANO JUGADOR 2");

        } else{
            System.out.println("EMPATE DEFINITIVO");
        }

    }

}
