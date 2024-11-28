package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


// Paramètre le chemin où sera écrit result.out
public class WriteSymptomsDataToFile implements ISymptomsWriter{

    private String filepath;
    
    public WriteSymptomsDataToFile(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {

        if (filepath != null && symptoms != null) {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {

                for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {

                    writer.write(entry.getKey() + " : " + entry.getValue());

                    writer.newLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
