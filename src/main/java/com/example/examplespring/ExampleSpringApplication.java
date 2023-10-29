package com.example.examplespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleSpringApplication {

	public static void main(String[] args) {
		int soma = somar(1, 2);
		System.out.println(soma);
	}

	private static int somar(int a, int b) {
		return a + b;
	}

}
