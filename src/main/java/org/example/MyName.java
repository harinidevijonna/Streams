package org.example;

import java.util.function.Predicate;

public class MyName {
public static void main(String[] args) {
    // lambda xpression
    Add<Integer,Integer,Integer> obj = ( a,b)->{
       return a+b;
    };
    System.out.println(obj.add(2,3));
//    Function<String,Integer> obj1 =(a)->{
//        return a.toString();
//    };
    java.util.function.Function<Integer,String> o1=(a)->{
        return a.toString();
    };
    System.out.println(o1.apply(2));
//    Function<Integer,String> obj2 =(a)->{
//        return Integer.parseInt(a);
//    };
    java.util.function.Function<String,Integer> o2 =(a)->{
        return Integer.parseInt(a);
    };
    System.out.println(o2.apply("10"));
//    Test<Integer> obj3=(a)->{
//        if(a%2==0){
//            return true;
//        }
//        return false;
//    };
    Predicate<Integer>o3 =(a)->{
        if(a%2==0){
            return true;
        }
        return false;
    };
    System.out.println(o3.test(4));
    System.out.println(o3.test(3));

}
}

@FunctionalInterface
interface Add<R,T,S>{
    R add(T a, S b);

}
@FunctionalInterface
interface Function<R,T>{
    R apply(T a);
}
@FunctionalInterface
interface Test<T>{
    boolean test(T a);
}
