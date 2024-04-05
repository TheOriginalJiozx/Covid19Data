package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");

    public ArrayList<Covid19Data> loadAllPatients() {
        ArrayList<Covid19Data> patients = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(file, StandardCharsets.ISO_8859_1);
            sc.nextLine();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Covid19Data patient = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] attributes = line.split(";");
            patient = new Covid19Data((attributes[0]),
                    attributes[1],
                    Integer.parseInt(attributes[2]),
                    Integer.parseInt(attributes[3]),
                    Integer.parseInt(attributes[4]),
                    Integer.parseInt(attributes[5]),
                    attributes[6]
            );
            patients.add(patient);
        }
        sc.close();
        return patients;
    }

}

