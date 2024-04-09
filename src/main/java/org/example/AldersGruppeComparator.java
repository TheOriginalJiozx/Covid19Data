package org.example;

import java.util.Comparator;

public class AldersGruppeComparator implements Comparator<Covid19Data> {
    @Override
    public int compare(Covid19Data d1, Covid19Data d2) {
        String aldersgruppe1 = d1.getAldersgruppe();
        String aldersgruppe2 = d2.getAldersgruppe();
        return aldersgruppe1.compareTo(aldersgruppe2);
    }
}