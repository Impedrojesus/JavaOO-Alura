package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numnero;
    private String nonme;
    private Serie serie;

    private int totalVizualizacoes;

    public int getTotalVizualizacoes() {
        return totalVizualizacoes;
    }

    public void setTotalVizualizacoes(int totalVizualizacoes) {
        this.totalVizualizacoes = totalVizualizacoes;
    }

    public int getNumnero() {
        return numnero;
    }

    public void setNumnero(int numnero) {
        this.numnero = numnero;
    }

    public String getNonme() {
        return nonme;
    }

    public void setNonme(String nonme) {
        this.nonme = nonme;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificao() {
        if (totalVizualizacoes > 100) {
        return 4;
    } else {
        return 2;
    }
}
}
