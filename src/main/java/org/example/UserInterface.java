package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Covid19Data> patients;
    private Scanner scanner;

    public UserInterface(ArrayList<Covid19Data> patients) {
        this.patients = patients;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Vælg en sorteringsmulighed:");
            System.out.println("1. Sorter efter region");
            System.out.println("2. Sorter efter aldersgruppe");
            System.out.println("0. Afslut");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 0) {
                System.out.println("Programmet afsluttes.");
                break;
            }

            switch (choice) {
                case 1:
                    Collections.sort(patients, new RegionComparator());
                    break;
                case 2:
                    Collections.sort(patients, new AldersGruppeComparator());
                    break;
                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
                    continue;
            }

            // Udskriv sorteret liste
            for (Covid19Data data : patients) {
                System.out.println(data);
            }
        }

        scanner.close();
    }
}
