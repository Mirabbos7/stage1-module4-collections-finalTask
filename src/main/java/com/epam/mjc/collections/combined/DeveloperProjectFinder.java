package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

        // Filter projects where the developer is a member
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return Integer.compare(b.length(), a.length());
                } else {
                    return b.compareTo(a);
                }
            }
        });

        return result;
    }
}
