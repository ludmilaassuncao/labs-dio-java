package com.cafeteria.factory;
public class CafeExpresso implements ICafe{
    @Override
    public void preparar() {
        System.out.println("Preparando Café Expresso");
    }
}
