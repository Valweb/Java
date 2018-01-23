package Aula54;

/**
 * Created by Valéria on 23/01/2018.
 */
public class Formulario {
    enum Genero{
        FEMININO('F'), MASCULINO('M');
    private  char valor;

    Genero(char valor){
        this.valor = valor;
    }
    }
    private  String nome;
    private  Genero genero;

}
