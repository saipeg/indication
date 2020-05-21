package com.andrey;

class Indication {
    public static int assertIndication(int i, int expected) {
        if (i < 0) {
            i = -1;
        }

        if (i > 0) {
            i = 1;
        }

        if (i == 0) {
            i = 0;
        }

        return i;

    }
}
