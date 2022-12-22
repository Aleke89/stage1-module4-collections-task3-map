package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    boolean  answer;
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        if(functionMap.containsValue(requiredValue)){
            answer=true;
        }else{
            answer=false;
        }
        return answer;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<sourceList.size();i++){
            int number = 5*sourceList.get(i)+2;
            map.put(sourceList.get(i),number);
        }
        return map;
    }
}
