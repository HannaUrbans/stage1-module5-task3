package com.epam.mjc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
return list.stream()
        .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }


    public List<String> toUpperCaseCollection(List<String> list) {
return list.stream()
        .map(i->i.toUpperCase())
                .collect(Collectors.toList());

    }


    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream()
        .max(Integer::compareTo);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
return list.stream()
        .flatMap(resultList->resultList.stream())
        .min(Integer::compareTo);

    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce(0,(a,b) -> (a+b));
    }
}

//можно ли заменить на форич
