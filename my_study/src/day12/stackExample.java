package day12;

import java.util.Stack;

public class stackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(1000));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(10));
		
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getValue());
		}
	}
	
	public static class Coin {
		private int value;
		public Coin (int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
	}
}
