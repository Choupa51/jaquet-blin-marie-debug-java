package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	private ISymptomReader reader;
	private ISymptomsWriter writer;

	//1. Constructeur
	public AnalyticsCounter(ISymptomReader reader, ISymptomsWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}

	//2. Méthode qui récupère la liste des entrées
	public List<String> getSymptoms(){
		return reader.getSymptoms();
	}

	//3. Méthode qui compte les occurences 
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer> countSymptoms = new  HashMap<String, Integer>();

		for(String symptom : symptoms){
			countSymptoms.put(symptom, countSymptoms.getOrDefault(symptom, 0) + 1 );

		}
		return countSymptoms;
	}

	//4.Méthode qui trie les symptômes
	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms){ 
		return new TreeMap<>(symptoms);
		
	}

	//5.Méthode qui écrit dans le result.out
	public void writeSymptoms(Map<String, Integer> symptoms){
		writer.writeSymptoms(symptoms);
	}
	}