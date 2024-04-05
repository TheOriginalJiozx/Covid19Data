package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppe.csv ");

    public ArrayList<Covid19Data> loadAllPatients() {
        ArrayList<Covid19Data> patients = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            sc.nextLine();  // Skip første linje

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Covid19Data patient = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] attributes = line.split(",");
            patient = new Covid19Data(
                    (Integer.parseInt(attributes[0])),
                    (attributes[1]),
                    (attributes[2]),
                    (attributes[3]),
                    (attributes[4]),
                    (attributes[5]),
                    (attributes[6]),
                    attributes[7],
                    );

            patients.add(patient);

        }
        sc.close();
        return patients;
    }

}
