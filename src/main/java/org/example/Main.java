package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> patients = fh.loadAllPatients();

        UserInterface ui = new UserInterface(patients);
        ui.start();
    }
}