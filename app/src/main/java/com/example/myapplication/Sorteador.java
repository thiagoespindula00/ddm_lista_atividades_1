package com.example.myapplication;

import java.util.Random;

public class Sorteador {
    public static int sorteia(int minimo, int maximo) {
        return (new Random()).nextInt((maximo - minimo) + 1) + minimo;
    }
}
