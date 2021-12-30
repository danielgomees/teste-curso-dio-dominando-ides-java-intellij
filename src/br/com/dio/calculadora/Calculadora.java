package br.com.dio.calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        double a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("somar: " + String.format("%.0f", somar));
        System.out.println("subtrair: " + String.format("%.0f", subtrair));
        System.out.println("multiplicar: " + String.format("%.0f", multiplicar));
        System.out.println("dividir: " + String.format("%.1f", dividir));
    }

    public static double somar(double a, double b){
        return a + b;
    }

    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }

}
