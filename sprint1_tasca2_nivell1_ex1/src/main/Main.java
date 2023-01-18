package main;

import exception.VendaBuidaException;
import product.Product;
import product.Sale;

public class Main {

	public static void main(String[] args) throws VendaBuidaException {
		// TODO Auto-generated method stub

		//Product mProduct = new Product("pen",1.5f);
		
		Sale mSale = new Sale();
		
		//mSale.getmList().add(mProduct);
		
		try {
			mSale.calculateTotal();
		
		} catch (IndexOutOfBoundsException d) {
			
			throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
						
		}
		
	}

}
