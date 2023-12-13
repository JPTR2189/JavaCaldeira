package com.github.javacaldeiraonline.tributacao;

public class SeguroVida implements Tributavel {
    @Override
    public double calculaTributos() {
        return 42.0;
    }
}
