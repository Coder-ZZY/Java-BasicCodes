package com.zzy.Utils;

public class ArrayUtil {
    private ArrayUtil(){}
    public static String ArrPrint(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
/*        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i == arr.length - 1) break;
            else sb.append(", ");
        }*/
        //还可以这么写
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1) sb.append(arr[i]).append(", ");
            else sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    public static double ArrAvg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double)sum*(1.0)/arr.length;
    }
}
