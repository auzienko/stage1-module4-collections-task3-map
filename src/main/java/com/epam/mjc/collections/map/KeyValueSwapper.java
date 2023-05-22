package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            Integer currentValue = Optional.ofNullable(resultMap.get(e.getValue()))
                    .orElse(e.getKey());
            resultMap.put(e.getValue(), currentValue <= e.getKey() ? currentValue : e.getKey());
        }
        return resultMap;
    }
}
