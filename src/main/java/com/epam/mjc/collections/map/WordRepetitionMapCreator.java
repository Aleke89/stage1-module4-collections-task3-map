package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String,Integer> map = new HashMap<>();
        sentence.replaceAll(".$,","");
        sentence.toLowerCase();
        String[] words = sentence.split("[ \t\n,?.!\"]+");
        for (String word : words) {
            Integer integer = map.get(word.toLowerCase());
            if (integer == null)
                map.put(word.toLowerCase(), 1);
            else {
                map.put(word.toLowerCase(), integer + 1);
            }
        }
        if(sentence==""){
            return new HashMap<>();
        }else{
            return map;
        }
    }
}
