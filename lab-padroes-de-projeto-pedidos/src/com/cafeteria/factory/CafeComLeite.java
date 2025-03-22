package com.cafeteria.factory;
public class CafeComLeite implements ICafe{
    @Override
    public void preparar() {
        System.out.println("Preparando café com leite");
    }
}
