package com.rajhasti.java.core;

public class CurrencyConverter {

	int rupee=63;
	int dirham=3;
	int real=3;
	int chilean_peso=595;
	int mexican_peso=18;
	int _yen=107;
	int $australian=2;
	int dollar;
	int Rupee=68;
	
	private void printcurrencies() {
		System.out.println("rupee:"+rupee);
		System.out.println(" $australian:"+ $australian);
		System.out.println("Rupee:"+Rupee);
		System.out.println(" _yen:"+ _yen);
	}
	
	
	public static void main(String[] args) {
		
		CurrencyConverter cc = new CurrencyConverter();
		
        cc.printcurrencies();
	}

}
