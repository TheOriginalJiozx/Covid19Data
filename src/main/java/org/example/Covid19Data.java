package org.example;

public class Covid19Data {
    private String aldersgruppe;
    private String region;
    private int bekræftedeialt;
    private int døde;
    private int indlagteintensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String aldersgruppe, String region, int bekræftedeialt, int døde, int indlagteintensiv, int indlagte, String dato) {
        this.aldersgruppe = aldersgruppe;
        this.region = region;
        this.bekræftedeialt = bekræftedeialt;
        this.døde = døde;
        this.indlagteintensiv = indlagteintensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Hospitalized{" +
                "aldersgruppe=" + aldersgruppe +
                ", region='" + region + '\'' +
                ", bekræftede tilfælde i alt='" + bekræftedeialt + '\'' +
                ", døde='" + døde + '\'' +
                ", indlagte på intensiv afdeling='" + indlagteintensiv + '\'' +
                ", indlagte='" + indlagte + '\'' +
                ", ='" + dato + '\'' +
                '}';
    }
}
