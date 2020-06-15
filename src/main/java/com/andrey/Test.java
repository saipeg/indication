package com.andrey;

public class Test {

    public static void main(String[] args) {

        System.out.println("start");

        System.out.println(SimpleUtil.assertEquals(Sign.assertIndication(0), 0));
        System.out.println(SimpleUtil.assertEquals(Sign.assertIndication(3), 1));
        System.out.println(SimpleUtil.assertEquals(Sign.assertIndication(33), 1));
        System.out.println(SimpleUtil.assertEquals(Sign.assertIndication(-31), -1));

        System.out.println(SimpleUtil.assertNotEquals(Sign.assertIndication(31), -1));
        System.out.println(SimpleUtil.assertNotEquals(Sign.assertIndication(0), 1));
        System.out.println(SimpleUtil.assertNotEquals(Sign.assertIndication(-4), 1));

        System.out.println(SimpleUtil.assertEquals(Mod.mod(34, 9), 7));
        System.out.println(SimpleUtil.assertEquals(Mod.mod(21, 3), 0));
        System.out.println(SimpleUtil.assertEquals(Mod.mod(10, 4), 2));

        System.out.println(SimpleUtil.assertNotEquals(Mod.mod(10, 4), 1));
        System.out.println(SimpleUtil.assertNotEquals(Mod.mod(21, 3), 3));

        System.out.println(IsPrime.isPrime(5));

    }

}