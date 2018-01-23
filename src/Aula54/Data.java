package Aula54;

import java.time.format.DateTimeFormatter;

/**
 * Created by Valéria on 23/01/2018.
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;
    private int diaSemana;

    public Data(int dia, int mes, int ano, int diaSemana) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }

    public Data(int dia, int mes, int ano, DiaSemana sexta) {

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }
}
