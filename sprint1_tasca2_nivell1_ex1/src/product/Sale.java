package product;

import java.util.ArrayList;

import exception.VendaBuidaException;

public class Sale {

	private final ArrayList<Product> mList = new ArrayList<>();
	private float totalList;

	public Sale() {
		super();
	}

	public ArrayList<Product> getmList() {
		return mList;
	}

	public float getTotalList() {
		return totalList;
	}

	public void setTotalList(float totalList) {
		this.totalList = totalList;
	}

	@Override
	public String toString() {
		return "Sale [mList=" + mList + ", totalList=" + totalList + "]";
	}

	public void calculateTotal() throws VendaBuidaException {

		//To be able to change in order to throw the exception
		int i = 0;
		int j = 5;
		
		for (i=0; i<j; i++) {
			totalList += mList.get(i).getPrice();
		}
		System.out.println("The total sum is: " + totalList);
				

	}// closes method

}
