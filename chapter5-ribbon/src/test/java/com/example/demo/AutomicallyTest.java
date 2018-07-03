package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class AutomicallyTest {

    static AtomicInteger atomicInteger = new AtomicInteger(5);

    public static void main(String[] args) {


        atomicInteger.compareAndSet(0, 1);
        System.out.println(incrementAndGetModulo(2));
        System.out.println(atomicInteger.get());
    }

    private static int incrementAndGetModulo(int modulo) {
        for (;;) {
            int current = 0;
            System.out.println(11);
            int next = (current + 1) % modulo;
            if (atomicInteger.compareAndSet(current, next)) {
                return next;
            }
            System.out.println(111);
        }
    }
}
