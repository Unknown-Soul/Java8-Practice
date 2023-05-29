import  java.util.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main{
    public static void main(String args[]){
        List<Integer> listOfInteger = List.of(1,20,4,5,6,710,10,12);
        functionStream(listOfInteger);
    }

    public static void print(Integer number){
        System.out.println(number);
    }

    // :: Method Reference
    public static void functionStream(List<Integer> listOfInteger){
        // listOfInteger.stream.forEach(className::function);
        listOfInteger.stream().forEach(Main::print);
    }

    // Second Method Without creating print method
    public static void functionStream(List<Integer> listOfInteger){
        // listOfInteger.stream.forEach(className::function);
        listOfInteger.stream().forEach(System.out::println);
    }


//---------------------------------------------------------------------------------------------------

    // Filter
    // print all even number from list to checck condition we will use filter
    // will move to nextLine only when filter get true

    public  static boolean isEven(Integer i){
        if(i%2==0)
            return true;
        return false;
    }

    // first we filter all data then printing it one by one
    public static void filterExample(){
        listOfInteger.stream().filter(Main::isEven).foEach(System.out::println);
    }

    // Filter with lambda
    public static void filterExampleWithLambda(){
        listOfInteger.stream().filter(number -> number%2 == 0 ).forEach(System.out::println);
    }
//---------------------------------------------------------------------------------------------------

    //Map
    // lambda funcation to map a number to original number
    // print squre of each number in list
    public static void filterExample(){
        // here we map number with squre of number and printing it
        // first we map  squre of all number with number than printing it one by one
        listOfInteger.stream().map(number -> number * number).forEach(System.out::println);
    }
}
