package com.java.bootcamp;

interface MyInterface5 {
    // this interface have 2 method
    // one with method without default implimentation
    void display();
    // one with method with default implimentation
    default void display2(){

    }
}

class A implements MyInterface5{

    @Override
    public void display() {
        System.out.println("A");
    }

    @Override
    public void display2() {
        System.out.println("A invoked display 2");
    }


}

class B implements MyInterface5{

    @Override
    public void display() {
        System.out.println("B");
    }


}

class C implements MyInterface5{

    @Override
    public void display() {
        System.out.println("C");
    }

}


public class DefaultMethodDemo {
    public static void main(String[] args) {

        A a = new A();
        a.display2();
        B b = new B();
        b.display2();// although display 2 is not implimented in class B it will invoke default display metho
        C c = new C();
        c.display2();

    }
}
