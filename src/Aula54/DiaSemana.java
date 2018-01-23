package Aula54;

/**
 * Created by Valéria on 23/01/2018.
 * Enums Podem ser utilizados como uma classe
 */
public enum  DiaSemana {

    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private  int valor;
//Não utiliza modificador de acesso, o public no construtor enums
    DiaSemana(int valor){

        this.valor = valor;
    }
public int getValor(){
        return this.valor;
}

}

