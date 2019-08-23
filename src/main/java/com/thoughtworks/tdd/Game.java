package com.thoughtworks.tdd;

public class Game {
	public Game() {
		
	}
	
	public String result(int i) {
		String input = "";
		
		if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
			input += "FizzBuzzWhizz";
		}
		
		if (i % 3 == 0 && i % 7 == 0) {
			input += "FizzWhizz";
		}
		
		if (i % 7 == 0 && i % 5 == 0) {
			input += "BuzzWhizz";
		}
		
		if (i % 3 == 0 && i % 5 == 0) {
			input += "FizzBuzz";
		}
		
		if (i % 3 == 0) {
			input += "Fizz";
//			System.out.println(input);
		}
		if (i % 5 == 0) {
			input += "Buzz";
		}
		
		if (i % 7 == 0) {
			input += "Whizz";
		}
		
		return input;
	}
}
