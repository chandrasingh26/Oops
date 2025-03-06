package org.example;
public class Main extends Object{
    public static void main(String[] args) {

        Integer a = 100;    // java store value up to 127 in cache for faster processing
        Integer b = 500;

        Integer c = 100;
        Integer d = 500;

        System.out.println(a == c);    // that's why it gives true result
        System.out.println(b == d);
    }
}