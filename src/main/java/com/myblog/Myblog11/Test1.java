package com.myblog.Myblog11;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Employee>employees= Arrays.asList(
                new Employee("mike",36,"chennai"),
                new Employee("adam",25,"pune"),
                new Employee("stallin",30,"bengulureu"),
                new Employee("sam",34,"Hyderabad")
        );

//     Map<Integer, List<Employee>> collect= employees.stream().collect(Collectors.groupingBy(e->e.getAge()));
//     for(Map.Entry<Integer,List<Employee>>entry:collect.entrySet(){
//        int age= entry.getKey();
//        List<Employee>employeeswithAge=entry.getValue();
//            System.out.println("age"+age+"--");
//            for(Employee e:employeeswithAge)
//            {
//                System.out.println(e.getCity());
//                System.out.println(e.getName());
//
//        }
//    }
//        System.out.println(collect);
//for(Employee employee:employees)
//{
//   List<Employee>e=collect.get((employee.getAge()));
//   for(Employee x:e)
//   {
//       System.out.println(x.getName());
//       System.out.println(x.getCity());
//       System.out.println(x.getAge());
//   }
//}






//     List<Employee>emps = employees.stream().filter(emp->emp.getAge()<30).collect(Collectors.toList());
//    for(Employee e:emps)
//    {
//        System.out.println(e.getName());
//        System.out.println(e.getCity());
//        System.out.println(e.getAge());
//    }

//        List<Integer>numbers= Arrays.asList(10,12,6,5,7,8,9);
//        List<Integer>data=numbers.stream().filter(n1->n1%2==0).map(n2->n2*n2).collect(Collectors.toList());
//        System.out.println(data);



















    }
}
