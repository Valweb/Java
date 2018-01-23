package Aula55;


import Aula54.DiaSemana;

/**
 * Created by Valéria on 23/01/2018.
 */
public class TestEnum {

    public static void main(String[] args){
        DiaSemana[] dias = DiaSemana.values (); //Retornar todos os valores dentro do enumerador

        for( int i=0; i < dias.length; i++){
            System.out.println ("Dia da semana:  " + dias[i]);
        }
        // ou a forma de um for melhorado
        for (DiaSemana dia : DiaSemana.values ()){
            System.out.println (dia);

        }
    }
}
