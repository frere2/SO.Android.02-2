package com.example.bredufateczlsoex01.controller;

import android.util.Log;

public class RaizController {
    public String calcular(int a, int b, int c) {
        double delta, x1 = 0, x2 = 0;

        delta = (b * b) + (-4 * (a * c));

        if (delta >= 0) {

            x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);

        } else {
            Log.i("RaizController", "Delta < 0");
        }
        return delta >= 0 ? "Δ: " + delta + "\nx1: " + x1 + "\nx2: " + x2 : "Não possui raiz.";
    }
}
