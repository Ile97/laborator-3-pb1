package com.company;
public class Main {
    public static void main(String[] args) {
        String name = "Acesta este un String.";
        char[] chars = name.toCharArray();
        int i;
        int nr_aparitii = 0;
        char ch = 'i';
        for (i = 0; i < name.length(); i++) {
            if (chars[i] == ch) {
                nr_aparitii++ ;
                System.out.println(nr_aparitii);
            }
        }
    }
}
