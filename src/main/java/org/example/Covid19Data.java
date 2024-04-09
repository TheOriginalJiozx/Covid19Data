package org.example;

public class Covid19Data {
    private String aldersgruppe;
    private String region;
    private int bekræftedeialt;
    private int døde;
    private int indlagteintensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int bekræftedeialt, int døde, int indlagteintensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeialt = bekræftedeialt;
        this.døde = døde;
        this.indlagteintensiv = indlagteintensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Hospitalized{" +
                "region=" + region +
                ", aldersgruppe='" + aldersgruppe + '\'' +
                ", bekræftede tilfælde i alt='" + bekræftedeialt + '\'' +
                ", døde='" + døde + '\'' +
                ", indlagte på intensiv afdeling='" + indlagteintensiv + '\'' +
                ", indlagte='" + indlagte + '\'' +
                ", ='" + dato + '\'' +
                '}';
    }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }
}
