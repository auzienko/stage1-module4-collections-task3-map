package com.epam.mjc.collections.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.entrySet().stream().anyMatch(e -> e.getValue() == requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        return sourceList.stream()
                .collect(Collectors.toMap(e -> e, e -> 5 * e + 2));
    }
}
