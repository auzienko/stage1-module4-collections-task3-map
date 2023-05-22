package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> resultMap = new HashMap<>();
        if (sentence.isBlank()) {
            return resultMap;
        }
        String prepare = sentence.replaceAll("\\p{Punct}", "");
        String[] words = prepare.split(" ");
        for (String word : words) {
            String wordL = word.toLowerCase(Locale.ROOT);
            Integer i = resultMap.get(wordL);
            resultMap.put(wordL, i == null ? 1 : ++i);
        }
        return resultMap;
    }
}
