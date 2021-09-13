package com.company;

public class Main {

    public static void main(String[] args) {
        char[] alph = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String toMask = "CDE"; //ABC
        String masked = "";
        for (int i =0; i< toMask.length(); i++)
        {
            char letter = toMask.charAt(i);
            int idx = findIndex(alph,letter);
            masked += alph[idx-2<0 ? alph.length - idx-2:idx-2];

        }
        System.out.println(toMask);
        System.out.println(masked);
    }

    public static int findIndex(char[] arr, char target){
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
