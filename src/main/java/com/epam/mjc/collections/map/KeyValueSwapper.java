package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> map = new HashMap<>();
        for(Map.Entry<Integer,String> set:sourceMap.entrySet()){
            if(map.containsKey(set.getValue())){
                map.put(set.getValue(),set.getKey());
            }
            map.put(set.getValue(),set.getKey());
        }
        return map;
    }
}
