package com.company;

public class encrypt {
    private String wordToEncryptLocal;
    private String EncryptPhrase;

    public encrypt(String wordToEncrypt, String EncryptWord){
        this.wordToEncryptLocal = wordToEncrypt;
        this.EncryptPhrase = Main.padRight(EncryptWord, wordToEncrypt.length());
    }



    public String encrypt(){
        String result = "";
        int i = 0;
        char[] letters = this.wordToEncryptLocal.toCharArray();
        for(char letter : letters){
            int idx = (Main.findIndex(letter) + Main.findIndex(this.EncryptPhrase.charAt(i))) % Main.alph.length;
            result += Main.alph[idx];
            i++;
        }
        return result;
    }

    public String decrypt(){
        String result = "";
        int q = 0;
        char[] letters = this.encrypt().toCharArray();
        for(char letter : letters){
            int idx = (Main.findIndex(letter) + Main.alph.length - Main.findIndex(this.EncryptPhrase.charAt(q))) % Main.alph.length;
            result += Main.alph[idx];
            q++;
        }
        return result;
    }
}
