/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplestreamapi;

import java.util.stream.IntStream;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
    int[] values={3,10,6,1,4,8,2,5,9,7};
    System.out.println("Original values: ");
    IntStream.of(values).forEach(value->System.out.println(value));
    System.out.println("Count of values is: "+IntStream.of(values).count());
    System.out.println("Min  value is: "+IntStream.of(values).min().getAsInt());
    System.out.println("Max  value is: "+IntStream.of(values).max().getAsInt());
    System.out.println("Average  value is: "+IntStream.of(values).average().getAsDouble());
    System.out.println("Sum of values is: "+IntStream.of(values).sum());
    System.out.println("Sum of squares via reducee: "+IntStream.of(values).reduce(0,(x,y)->x+y*y));
    System.out.println("Product of values via reducee: "+IntStream.of(values).reduce(1,(x,y)->x*y));
    System.out.println("Print Even Values Sorted: ");
    IntStream.of(values).filter(value-> value% 2 == 0).sorted().forEach(value-> System.out.printf("%d ", value));
    System.out.println(" ");
    System.out.println("Print odd Values multiplied by 10 Sorted: ");
    IntStream.of(values).filter(value->value%2!=0).map(value->value*10).sorted().forEach(value-> System.out.printf("%d ", value));
    }
    
}
