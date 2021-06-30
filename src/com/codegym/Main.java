package com.codegym;

public class Main {

    public static void main(String[] args) {
	NumberGenetor numberGenetor1 = new NumberGenetor("thread1");
	numberGenetor1.start();
	NumberGenetor numberGenetor2 = new NumberGenetor("thread2");
	numberGenetor2.start();

    }
}
