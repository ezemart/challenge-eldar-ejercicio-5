package com.example;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        String[] myArray = {"FirstWord", "SecondWord", "THIRDWORD"};
        processArray(myArray);
    }

    public static void processArray(String[] myArray) {
        // Unir todos los elementos del array con espacios
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < myArray.length; i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(myArray[i].toLowerCase());
        }
        // Imprimir el resultado
        System.out.println(result.toString());
    }
}
