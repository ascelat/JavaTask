package org.example.task3;

import java.util.*;

public class Task3Impl implements Task3 {
    @Override
    public List<Integer> removeDuplicates(List<Integer> numbers) {
        List<Integer> HaventDublicate = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if(!HaventDublicate.contains(numbers.get(i))){
                HaventDublicate.add(numbers.get(i));
            }
        }
        return HaventDublicate;
    }

    @Override
    public Set<Integer> findIntersection(List<Integer> first, List<Integer> second) {
        Set s1 = new HashSet<>();
        Set s2 = new HashSet<>();
        Set overlap = new HashSet<>();

        for(int i : first){
            s1.add(i);
        }
        for(int i : second){
            s2.add(i);
        }

        for(Object i : s1){
            if(s2.contains(i)){
                overlap.add(i);
            }
        }

        return overlap;
    }

    @Override
    public Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> myMap = new HashMap<>();
        for(String i : words){
            if(!myMap.containsKey(i) && i != null){
                myMap.put(i, 1);
            } else if (i != null) {
                int key = myMap.get(i);
                myMap.replace(i, key+=1);
            }
        }
        return myMap;
    }

    @Override
    public Map<Integer, List<String>> groupByGrade(Map<String, Integer> students) {
        Map<Integer, List<String>> newMap = new HashMap<>();

        for(Integer value : students.values()){
            if(!newMap.containsKey(value)){
                List<String> newKey = new ArrayList<>();
                newMap.put(value, newKey);
            }
        }

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            Integer value = entry.getValue(); // Вот ваше значение
            if(!newMap.containsKey(value)){
                String key = entry.getKey();
                List<String> newValue = new ArrayList<>();
                newValue.add(key);
                newMap.put(value, newValue);
            }
            else{
                List<String> values = newMap.get(value);
                values.add(entry.getKey());
                newMap.put(value, values);
            }
        }
        return newMap;
    }

    @Override
    public int findMostFrequent(List<Integer> numbers) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int maxCount = 1;
        int minElement = numbers.get(0);

        for(int i : numbers){
            if(!myMap.containsKey(i)){
                myMap.put(i, 1);
                if(maxCount == 1 && i < minElement){
                    minElement = i;
                }
            }
            else{
                int value = myMap.get(i) + 1;
                myMap.replace(i,value);

                if(maxCount < value){
                    maxCount = value;
                    minElement = i;
                } else if (maxCount == value) {
                    if(i < minElement){
                        minElement = i;
                    }
                }
            }
        }
        return minElement;
    }

    @Override
    public Map<String, Object> compareSets(Set<String> first, Set<String> second) {
        Set<String> union = new HashSet<>();
        Set<String> intersection = new HashSet<>();
        Set<String> difference = new HashSet<>();
        boolean isSubset = false;

        Map<String, Object> answers = new HashMap<>();

        int elements = 0;
        for (String i : first) {
            union.add(i);
            if(second.contains(i)){
                intersection.add(i);
                elements += 1;
            }
            else{
                difference.add(i);
            }
        }

        for (String i : second) {
            union.add(i);
        }

        if(elements == first.size()){
            isSubset = true;
        }

        answers.put("union", union);
        answers.put("intersection", intersection);
        answers.put("difference", difference);
        answers.put("isSubset", isSubset);

        return answers;
    }

    @Override
    public int sumOfLengths(List<String> words) {
        int length = 0;
        for(String s : words){
            if(s != null){
                length += s.length();
            }
        }
        return length;
    }

    @Override
    public List<String> normalizeNames(List<String> names) {
        List<String> myList = new ArrayList<>();
        String updateName;
        for(String s : names){
            if(s != null && !s.trim().isEmpty()){
                myList.add(s.trim().toUpperCase());
            }
        }
        return myList;
    }
}
