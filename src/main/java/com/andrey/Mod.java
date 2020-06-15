package com.andrey;

public class Mod {

    public static int mod(int num, int divisor) {
        return (num - divisor * (num / divisor));
    }
}
