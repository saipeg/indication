package com.andrey;

public class IndicationTest {

    public static void main(String[] args) {

        System.out.println("start");

        System.out.println(SimpleUtil.assertEquals(Indication.assertIndication(0), 0));
        System.out.println(SimpleUtil.assertEquals(Indication.assertIndication(3), 1));
        System.out.println(SimpleUtil.assertEquals(Indication.assertIndication(33), 1));
        System.out.println(SimpleUtil.assertEquals(Indication.assertIndication(-31), -1));

        System.out.println(SimpleUtil.assertNotEquals(Indication.assertIndication(31), -1));
        System.out.println(SimpleUtil.assertNotEquals(Indication.assertIndication(0), 1));
        System.out.println(SimpleUtil.assertNotEquals(Indication.assertIndication(-4), 1));

    }

}