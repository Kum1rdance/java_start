package com.company;
import java.util.Scanner;
public class Main {

    static Scanner in = new Scanner(System.in);
    static char[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static void main(String[] args) {
        System.out.println("Enter word to encrypt");
        String wordToEncrypt = in.nextLine();
        System.out.println("Enter crypt word");
        String cryptWord = in.nextLine();
        encrypt crypt = new encrypt(wordToEncrypt, cryptWord);
        System.out.println(crypt.encrypt());
        System.out.println(crypt.decrypt());
    }

    public static String padRight(String s, int n) {
        String res = "";
        if(s.length() < n){
            int i = 0;
            while(res.length() != n){
                res += s.charAt(i);
                i = s.length() - 1 >= i + 1 ? i + 1 : 0;
            }
        }else{
            res = s.substring(0, n);
        }
        return res;
    }

    public static int findIndex(char c) {
        for(int i = 0; i < Main.alph.length; i++){
            if(Main.alph[i] == c){
                return i;
            }
        }
        return -1;
    }
}
