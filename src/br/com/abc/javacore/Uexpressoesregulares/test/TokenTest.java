package br.com.abc.javacore.Uexpressoesregulares.test;


public class TokenTest {
    public static void main(String[] args) {
        String str = "Gain9 Diego1 Olga2 Camila3 Nubia4 John5 Matheus";
        String[] tokens = str.split("\\d");
        for(String arr: tokens){
            System.out.println(arr.trim());
        }
    }
}
