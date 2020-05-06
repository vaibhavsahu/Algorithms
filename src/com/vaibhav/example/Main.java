package com.vaibhav.example;

import org.joda.time.DateTime;
import org.joda.time.Hours;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
//test
    public static void main(String[] args) throws IOException {

        //File dest = File.createTempFile("Import" + "_" + new Date().getTime(), ".csv");

        Set<BulkOptins> bulkOptinsSet = new HashSet<>();
        bulkOptinsSet.add(new BulkOptins("test", 122333L, true));
        bulkOptinsSet.add(new BulkOptins("test", 122338L, true));
        bulkOptinsSet.add(new BulkOptins("test", 122334L, false));
        bulkOptinsSet.add(new BulkOptins("test1", 122335L, true));
        bulkOptinsSet.add(new BulkOptins("test1", 122336L, false));

        Map<String, List<Long>> map1 = bulkOptinsSet.stream().filter( b -> b.isOld() == true)
                .collect(Collectors.groupingBy(BulkOptins::getName, Collectors.mapping(BulkOptins::getPhone, Collectors.toList())));

        System.out.println(map1.keySet() + " " +map1.values());

        //Map<City, Set<String>> namesByCity = people.stream().collect(groupingBy(Person::getCity, mapping(Person::getLastName, toSet())));
        //stream().collect(groupingBy(Function.identity()));
//        Stream<Integer> j = Arrays.asList(1, 2, 3, 4, 5).stream();
//
//        j.map(i -> i * 10)
//                .forEach(System.out::println);

       // j.map(i -> i + 5)
        //        .forEach(System.out::println);

    }
}
