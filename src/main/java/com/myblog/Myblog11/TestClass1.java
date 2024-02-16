package com.myblog.Myblog11;

public class TestClass1 {
    public static void main(String[] args) {


//        List<String> numbers= Arrays.asList("mike","adam","mike","Stallin");
//        List<String>data1=numbers.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
//        List<String>data2=numbers.stream().filter(s->s.equals("mike")).collect(Collectors.toList());
//        List<String>data3=numbers.stream().filter(s->s.endsWith("n")).collect(Collectors.toList());
//        System.out.println(data1);
//        System.out.println(data2);
//        System.out.println(data3);



//        List<Integer>numbers= Arrays.asList(10,12,1,5,16,19,20);
//        List<Integer>oddNumbers=numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
//        System.out.println(oddNumbers);



//        List<Integer> Numbers = Arrays.asList(10, 12, 1, 5, 16, 19, 20);
//
//       List<Integer>evenNumber= Numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(evenNumber);


//      Predicate<String> val= str->str.equals("faheem");
//
//        boolean result=val.test("faheem");
//        System.out.println(result);


//        List<Integer> numbers = Arrays.asList(10, 20, 15, 45, 46, 16);
//        Predicate<Integer> val= x->x%2==0;
//       boolean result= val.test(10);
//        System.out.println(result);



//        Consumer<Integer>result=number-> System.out.println(number);
//        result.accept(100);
//        List<String>names= Arrays.asList("mike","adam","sam");
//        Consumer<String>val=name-> System.out.println(name);
//        names.forEach(val);
// consumer functional interface it take input but produces no output










//        List<String>word= Arrays.asList("apple","banana","apple","orange","banana");
//        long count=word.stream().filter(words->words.equals("apple")).count();
//        System.out.println( "count is"+count);


//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int threshold = 3;
//        List<Integer> filteredList = numbers.stream().filter(num -> num < threshold).collect(Collectors.toList());
//        System.out.println(filteredList);

//        List<String> strings = Arrays.asList("apple", "banana", "grape", "orange");
//        String concatenatedString = strings.stream().collect(Collectors.joining(", "));
//        System.out.println(concatenatedString);

//        List<Integer> list1 = Arrays.asList(1, 2, 3);
//        List<Integer> list2 = Arrays.asList(3, 4, 5);
//        List<Integer> mergedListWithoutDuplicates = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
//        System.out.println(mergedListWithoutDuplicates);
//        List<Integer> list1 = Arrays.asList(1, 2, 3);
//        List<Integer> list2 = Arrays.asList(3, 4, 5);
//        List<Integer> difference = list1.stream().filter(num -> !list2.contains(num)).collect(Collectors.toList());
//        System.out.println(difference);



//        List<String>names= Arrays.asList("mike","adam","sam");
//        Consumer<String> val=name-> System.out.println(name);
//        names.forEach(val);
     //   System.out.println(new Random().nextInt(500));

//        Supplier<Integer>x=()->new Random().nextInt(500);
//        Integer y=x.get();
//        System.out.println(y);































    }
}
