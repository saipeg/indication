package com.andrey;

class Sign {
    public static int assertIndication(int i) {
        if (i < 0) {
            i = -1;
        }

        if (i > 0) {
            i = 1;
        }

        return i;

    }
}
