package br.com.abc.javacore.Zcolecoes.test;

import br.com.abc.javacore.Zcolecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S23", "123456");
        Celular celular2 = new Celular("iPhone 14pro max", "981821");
        Celular celular3 = new Celular("pocco Phone x5 pro", "019212");
        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for(Celular celular : celularList){
            System.out.println(celular);
        }
        Celular celular4 = new Celular("pocco Phone x5 pro", "123456");
        System.out.println(celularList.contains(celular4));

    }
}
