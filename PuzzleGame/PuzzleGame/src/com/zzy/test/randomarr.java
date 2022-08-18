package com.zzy.test;

import java.util.Random;

public class randomarr {
    public static void main(String[] args) {
        int[] tmparr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r = new Random();
        for (int i = 0; i < tmparr.length; i++) {
            int index = r.nextInt(tmparr.length);

        }
    }
}
