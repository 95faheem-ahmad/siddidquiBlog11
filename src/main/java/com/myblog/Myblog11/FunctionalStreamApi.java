package com.myblog.Myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalStreamApi {
    public static void main(String[] args) {

        List<Integer>data= Arrays.asList(15,3,60,100,1,15,100,60);
        List<Integer>newdata=data.stream().distinct().collect(Collectors.toList());
        System.out.println(newdata);

//        List<Integer> data= Arrays.asList(15,3,60,100,1);
//        List<Integer>newdata=data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newdata);


//        List<String>data= Arrays.asList("mike","stallin","adam");
//        List<String>newData=data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);


//        List<String>data= Arrays.asList("mike","stallin","adam");
//        List<String>newdata=data.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newdata);



//        List<Integer>data= Arrays.asList(10,20,30,60,90);
//        List<Integer>newNumber=data.stream().map(i->i+10).collect(Collectors.toList());
//        System.out.println(newNumber);




//        Function<Integer,Integer>result=i->i+10;
//        Integer val=result.apply(30);
//        System.out.println(val);




//       Function<String,Integer> result= str->str.length();
//       Integer val=result.apply("faheemsiddiqui");
//        System.out.println(val);

    }
}
