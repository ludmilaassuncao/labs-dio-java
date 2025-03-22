package com.cafeteria.factory;
public class CafeFactory {
    public static ICafe criarCafe(String tipo) {
        return switch(tipo.toLowerCase()) {
            case "expresso" -> new CafeExpresso();
            case "com leite" -> new CafeComLeite();
            default -> throw new IllegalArgumentException("Tipo de café inválido!");
        };
    }
}
