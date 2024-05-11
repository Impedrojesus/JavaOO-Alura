package br.com.alura.screenmatch.modelos;

public class Episodio {
    private int numnero;
    private String nonme;
    private Serie serie;

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
}
