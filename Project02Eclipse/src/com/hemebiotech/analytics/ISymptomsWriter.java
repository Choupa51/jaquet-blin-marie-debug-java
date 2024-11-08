package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomsWriter {

        void writeSymptoms(Map<String, Integer> symptoms);
        // quantiteSymptoms.put(new Sympom(paramètre 1, para 2, etc), qté)
}
