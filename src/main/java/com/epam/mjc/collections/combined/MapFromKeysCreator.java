package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        HashMap<Integer, Set<String>> swappedMap = new HashMap<>();
        for(Map.Entry<String, Integer> entry : sourceMap.entrySet()){
            String key = entry.getKey();
            int length = key.length();
            if(!swappedMap.containsKey(length)){
                swappedMap.put(length, new HashSet<>());

            }
            swappedMap.get(length).add(key);

        }
        return swappedMap;


//        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            swappedMap.put(value, key);
//        }
//        return swappedMap;
    }
}
