package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        int[] array = {5, -2, 4, 10, -22, 35, -14, 45};
        Map<Boolean, List<Integer>> result = Arrays.stream(array).boxed()
                .collect(Collectors.partitioningBy(x -> x > 0));
        List<Integer> positiveList = new ArrayList(result.get(true));
        List<Integer> negativeList = new ArrayList(result.get(false));
        positiveList.addAll(negativeList.stream().map(s -> s * (-1)).collect(Collectors.toList()));
        System.out.println(positiveList);
    }
}