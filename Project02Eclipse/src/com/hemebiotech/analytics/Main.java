package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;


public class Main {
    
	public static void main(String[] args) {

        try {
    
            ISymptomReader reader = new  ReadSymptomDataFromFile("symptoms.txt");
            ISymptomsWriter writer = new  WriteSymptomsDataToFile("result.out");

            AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);

            List<String> symptoms = analyticsCounter.getSymptoms();
            Map<String, Integer> countSymptoms = analyticsCounter.countSymptoms(symptoms);
            Map<String, Integer> sortSymptoms = analyticsCounter.sortSymptoms(countSymptoms);
            
            analyticsCounter.writeSymptoms(sortSymptoms);

            System.out.println("Le fichier a été généré correctement.");

    
                
            } catch (NullPointerException exception) {
                System.out.println("Le fichier de symptoms n'a pas pu être généré correctement.");
            }
        }

}


