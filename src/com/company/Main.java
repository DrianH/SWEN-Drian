package com.company;
import com.company.basics.TestClass;
import com.company.exercise1.BaseClass;
import com.company.exercise1.DerivedClass;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("wtf am i doing");

        System.out.println(TestClass.VALUE);
        System.out.println(TestClass.getValue());

        TestClass test = new TestClass("Drian");
        System.out.println(test.getName());*/

        BaseClass bc = new BaseClass();
        DerivedClass dc = new DerivedClass();
        BaseClass bcdc = new DerivedClass();

        ((DerivedClass)bcdc).method2("Test");
    }
}