package br.com.abc.javacore.ZZDthreads.test;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


class ListaNomes {
    private List<String> nomes = new LinkedList<>();

    public synchronized void add(String nome) {
        nomes.add(nome);
    }

    public  synchronized void removerPrimeiro() {
        if (nomes.size() > 0) {
            System.out.println(nomes.remove(0));
        }
    }
}

public class ThreadSafeTest {
    public static void main(String[] args) {
        final ListaNomes nome = new ListaNomes();
        nome.add("Gian Santos");
        class RemovedorDeNomes extends Thread {
            public void run() {
                nome.removerPrimeiro();
            }
        }
        new RemovedorDeNomes().start();
        new RemovedorDeNomes().start();
    }
}
