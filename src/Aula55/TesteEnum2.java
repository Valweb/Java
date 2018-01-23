package Aula55;

import Aula54.DiaSemana;

/**
 * Created by Valéria on 23/01/2018.
 */

public class TesteEnum2 {

    public static void main(String[] args) {

        System.out.println (Enum.valueOf (DiaSemana.class, "DOMINGO"));

        // como uma variavel "dia"

        DiaSemana dia = Enum.valueOf (DiaSemana.class, "DOMINGO");

        System.out.println (dia);
    }
}
