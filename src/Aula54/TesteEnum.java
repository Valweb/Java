package Aula54;

/**
 * Created by Valéria on 23/01/2018. Aulas da Loiane
 * Enums Podem ser utilizados no lugar de classes
 */

public class TesteEnum {

    public static void main(String[] args){

        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println (dia.toString () + " - " + dia.getValor());

        Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);


    }
}
