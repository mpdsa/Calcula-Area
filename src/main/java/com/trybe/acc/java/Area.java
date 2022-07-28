package com.trybe.acc.java;

import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

/** Calcula area do quadrado. */
public class Area {

  /** Calcula area do quadrado. */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    StringBuilder stringBuilder = new StringBuilder();

    System.out.println("Digite a medida do lado do quadrado:");
    double lado = scan.nextDouble();
    double area = Math.pow(lado, 2);

    scan.close();

    StringBuilder frase = stringBuilder
                                        .append("A area do quadrado de lado ")
                                        .append(lado)
                                        .append(" é igual a ")
                                        .append(area);
        
    System.out.println(frase);
  }
}