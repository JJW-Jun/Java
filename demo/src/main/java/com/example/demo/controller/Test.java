package com.example.demo.controller;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {
    public static void main(String...args){
        ArrayList<String> a = new ArrayList<>();
        a.add("String");
        a.add("is");
        a.add("so");
        a.add("Long");
        Stream<String> s = a.stream();
        s.map(String::toString).forEach(System.out::println);
        
    }
}
