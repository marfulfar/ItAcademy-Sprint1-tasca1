package exception;


public class VendaBuidaException extends Exception{

	String errorMessage = "Per fer una venda primer has d’afegir productes";
		
	public VendaBuidaException(String errorMessage) {
        errorMessage = this.errorMessage;
	}


	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		
		return errorMessage;
		
	}

	
	
	
	
}
