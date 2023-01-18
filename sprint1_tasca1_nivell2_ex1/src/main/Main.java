package main;

import phone.Smartphone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Smartphone mPhone = new Smartphone("Nokia","N55");
		
		mPhone.call("679535133");
		mPhone.takePicture();
		mPhone.alarm();
	}

}
