package com.andrey;

public class IndicationTest {

    public static void main(String[] args) {

        System.out.println("start");

        System.out.println(Indication.assertIndication(0, 0));
        System.out.println(Indication.assertIndication(3, 1));
        System.out.println(Indication.assertIndication(33, 1));
        System.out.println(Indication.assertIndication(-31, -1));

    }

}