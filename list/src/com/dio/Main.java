package com.dio;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


import javax.management.Query;

public class Main {

    public static void main(String[] args) {
        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("Ford"));
        listaCarro.add(new Carro("Chevrolet"));
        listaCarro.add(new Carro("Fiat"));
        listaCarro.add(new Carro("Peugeot"));

        System.out.println(listaCarro.contains(new Carro("Ford")));

        System.out.println(listaCarro.get(2));
        System.out.println(listaCarro.indexOf(new Carro("Fiat")));

        System.out.println(listaCarro.remove(2));
        System.out.println(listaCarro);
       
    }
    
}
