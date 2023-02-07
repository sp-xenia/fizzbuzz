package it.xeniaconsulting.fizzbuzz;

public abstract class Printer {
	public String trasforma(int n) {
		String ret = "";
		if (n % getDivisore() == 0) return getString();
		return ret;
	}
	
	abstract int getDivisore();
	abstract String getString();
	
}
