package com.uzi.javaGenericParadigm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Java 泛型 PE
 * @Author: LIU.KL
 * @Date: 2020/4/19
 * ...
 */
public class ProductExtendsSample {

    static class Car {}
    static class BMW extends Car {}
    static class BMWX5 extends BMW {}
    static class BMWZ4 extends BMW {}

    public static void main(String[] args) {
        List<? extends BMW> bmws = new ArrayList<>();
//        bmws.add(new Car());  // compile error
//        bmws.add(new BMW());  // compile error
//        bmws.add(new BMWX5()); // compile error
//        bmws.add(new BMWZ4()); // compile error

        bmws = new ArrayList<BMW>();  // compile success
        bmws = new ArrayList<BMWX5>();  // compile success
//        bmws = new ArrayList<Car>(); // compile error
//        bmws = new ArrayList<? extends BMW>(); // compile error（通配符类型无法实例化）

        BMW bmw = bmws.get(0); // compile success
    }
}
