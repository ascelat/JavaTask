package org.example.task3;

import java.util.*;


public class Task3_dev implements Task3{

    @Override 
    public List<Integer> removeDuplicates(List<Integer> numbers){
        Set<Integer> set = new HashSet<>(numbers);
        List<Integer> arr = new ArrayList<>(set);
        return arr;
            
    }

    @Override 
    public Set<Integer> findIntersection(List<Integer> first, List<Integer> second){
        Set <Integer> a1 = new HashSet<>(first);
        Set <Integer> a2 = new HashSet<>(second);
        a1.retainAll(a2);
        return a1;
    }

    @Override  
    public Map<String, Integer> countWords(List<String> words){
        Map<String, Integer> map = new HashMap<String,Integer>();

        for (String i : words){
                map.merge(i, 1, Integer::sum);
            }

        return map;
    }

    @Override 
    public Map<Integer, List<String>> groupByGrade(Map<String, Integer> students){
        Map<Integer, List<String>> map = new HashMap<>();

        for (Map.Entry<String, Integer> i : students.entrySet()){
            map.computeIfAbsent(i.getValue(), arr -> new ArrayList<>()).add(i.getKey());
        }

        return map;
    }

    @Override
    public int findMostFrequent(List<Integer> numbers){
        Map<Integer, Integer> map = new HashMap<>();

        for(Integer i : numbers){
            map.merge(i, 1, Integer::sum);
        }

        int max = 0;
        int maxValue = 0;
        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            if(i.getValue() > max){
                max = i.getValue();
                maxValue = i.getValue();
            }
        }

        return maxValue;
    }

    @Override 
    public Map<String, Object> compareSets(Set<String> first, Set<String> second){
        Map<String, Object> result = new HashMap<>();

        Set<String> union = new HashSet<>(first);
        union.addAll(second);
        result.put("union", union);

        Set<String> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        result.put("intersection", intersection);

        Set<String> difference = new HashSet<>(first);
        difference.removeAll(second);
        result.put("difference", difference);

        boolean isSubset = second.containsAll(first);
        result.put("isSubset", isSubset);

        return result;
    }

    @Override 
    public int sumOfLengths(List<String> words){
        int leanString = 0;

        for (String i : words){
            leanString += i.length();    
        }

        return leanString;
    }   

    @Override 
    public List<String> normalizeNames(List<String> names){
        List <String> arr = new ArrayList<>();

        for (String i : names){
            arr.add(i.toUpperCase().trim());
        }

        return arr;
    }
}
