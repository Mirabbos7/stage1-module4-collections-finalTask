package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> classes = new HashSet<>();
        for (List<String> subject: timetable.values()){
            classes.addAll(subject);
        }
        return classes;
    }
}
