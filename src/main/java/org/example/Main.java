package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        //load tour patients
        ArrayList<Covid19Data> patients = fh.loadAllPatients();

        for (Covid19Data patient: patients) {
            System.out.println(patient);
        }
    }
}